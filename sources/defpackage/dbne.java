package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.net.Uri;
import android.view.MenuItem;
import com.google.android.gms.wearable.PutDataRequest;
import j$.time.Instant;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbne {
    public static final enru a = enru.c("com/google/android/apps/messaging/ui/debug/wearable/WearableDebugMenuProvider");
    public static final Uri b = PutDataRequest.a("/bugle/phone_config/").a;
    public static final Uri c = PutDataRequest.a("/bugle/rpc/proto/v1/conversations_list/").a;
    public static final Uri d = PutDataRequest.a("/bugle/conversations/*").a;
    public final dhzj e;
    public final comc f;
    public final cvhr g;
    public final cviz h;
    public final ffbr i;
    public final elbx j;
    public final ddwn k;
    public final ffsk l;

    public dbne(dbir dbirVar, dhzj dhzjVar, comc comcVar, cvhr cvhrVar, cviz cvizVar, ffbr ffbrVar, elbx elbxVar, ddwn ddwnVar, ffsk ffskVar) {
        dbirVar.getClass();
        dhzjVar.getClass();
        cvhrVar.getClass();
        cvizVar.getClass();
        elbxVar.getClass();
        ddwnVar.getClass();
        ffskVar.getClass();
        this.e = dhzjVar;
        this.f = comcVar;
        this.g = cvhrVar;
        this.h = cvizVar;
        this.i = ffbrVar;
        this.j = elbxVar;
        this.k = ddwnVar;
        this.l = ffskVar;
    }

    public static final Object c(dhre dhreVar, ffgu ffguVar) {
        return fgfz.c(duin.a(dhreVar), ffguVar);
    }

    public final void a(MenuItem menuItem, final Activity activity, final ffji ffjiVar) {
        menuItem.setOnMenuItemClickListener(new elbk(this.j, "WearDebugMenuClick", new MenuItem.OnMenuItemClickListener() { // from class: dbmq
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem2) {
                menuItem2.getClass();
                ffjiVar.invoke(dbir.a(activity, Optional.empty(), Optional.empty()));
                return false;
            }
        }));
    }

    public final void b(final Activity activity) {
        String str;
        final String c2;
        boolean b2 = this.h.b();
        boolean b3 = this.g.b();
        degi degiVar = (degi) this.f.l();
        if ((degiVar.b & 1) != 0) {
            long epochSecond = Instant.now().getEpochSecond();
            eyja eyjaVar = degiVar.c;
            if (eyjaVar == null) {
                eyjaVar = eyja.a;
            }
            long e = ffpy.e(epochSecond - eyjaVar.b, ffpz.d);
            str = ffpw.f(e) + "d" + ffpw.b(e) + "h" + ffpw.c(e) + "m" + ffpw.e(e) + "s ago";
        } else {
            str = "N/A";
        }
        c2 = ffpc.c("\n      |Wear companion app installed: " + b2 + "\n      |Watch recently online: " + b3 + "\n      |Last online: " + str + "\n      |\n      |Wear sync enabled: " + b3 + "\n    ", "|");
        cslq.e(new Runnable() { // from class: dbmn
            @Override // java.lang.Runnable
            public final void run() {
                enru enruVar = dbne.a;
                new AlertDialog.Builder(activity).setTitle("Wear Sync State").setMessage(c2).setCancelable(true).show();
            }
        });
    }
}
