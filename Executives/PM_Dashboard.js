// SIDEBAR TOGGLE

var sidebarOpen = false;
var sidebar = document.getElementById("sidebar");

function openSidebar()
{
    if(!sidebarOpen)
    {
        sidebar.classList.add("sidebar-responsive");
        sidebarOpen = true;
    }
}

function closeSidebar()
{
    if(sidebarOpen)
    {
        sidebar.classList.remove("sidebar-responsive");
        sidebarOpen = false;
    }
}

function openDashboard()
{
    window.open("PM_Dashboard.html", "_self")
}

function openManageProperties()
{
    window.open("PM_ManageProperties.html", "_self")
}

function openTenantApplications()
{
    window.open("PM_TenantApplications.html", "_self")
}

function openReports()
{
    window.open("PM_Reports.html", "_self")
}

function openSearchProperties()
{
    window.open("PropertySearch.html")
}

function openLogout()
{
    window.open("login.html", "_self")
}