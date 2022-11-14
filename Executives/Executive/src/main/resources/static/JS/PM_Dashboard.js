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
    window.open("/admin/dash", "_self")
}

function openManageProperties()
{
    window.open("/admin/properties", "_self")
}

function openTenantApplications()
{
    window.open("/admin/applications", "_self")
}

function openReports()
{
    window.open("PM_Reports.html", "_self")
}