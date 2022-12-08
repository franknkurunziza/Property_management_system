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
    window.open("PM_Dashboard", "_self")
}

function openManageProperties()
{
    window.open("PM_ManageProperties", "_self")
}

function openTenantApplications()
{
    window.open("PM_TenantApplications", "_self")
}

function openReports()
{
    window.open("PM_Reports", "_self")
}

function openSearchProperties()
{
    window.open("/")
}

function openLogout()
{
    window.open("/logout", "_self")
}