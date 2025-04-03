package defpackage;

import android.view.ActionMode;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.appsettings.SimMessagesActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxfr {
    public static final entd a = entd.c("Bugle");
    public static final emyl b = cfvl.v(190754619);
    public final cxfj c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    public final ffbr g;
    public final ffbr h;
    public final ffbr i;
    public final ffbr j;
    public final int k;
    public final ActionMode.Callback l = new cxfq(this);
    public ejzi m;
    public int n;
    public a o;

    /* compiled from: PG */
    final class a implements ejlr<Integer, Boolean> {
        public a() {
        }

        private final void d() {
            cxfr.this.b(-1);
            cxfr.this.a();
        }

        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void b(Object obj) {
        }

        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            Integer num = (Integer) obj;
            if (((Boolean) obj2).booleanValue()) {
                ((ensz) cxfr.a.n().h("com/google/android/apps/messaging/ui/appsettings/SimMessagesV2FragmentPeer$DeleteMessageCallback", "onSuccess", 462, "SimMessagesV2FragmentPeer.java")).t("SimMessagesActivity: deleted %d", num);
                d();
            } else {
                ((ddzb) cxfr.this.h.b()).k(R.string.sim_message_deletion_failed);
                ((ensz) ((ensz) cxfr.a.j()).h("com/google/android/apps/messaging/ui/appsettings/SimMessagesV2FragmentPeer$DeleteMessageCallback", "onSuccess", 466, "SimMessagesV2FragmentPeer.java")).t("SimMessagesActivity: could not delete %d", num);
            }
            d();
        }

        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
            ((ensz) ((ensz) ((ensz) cxfr.a.j()).g(th)).h("com/google/android/apps/messaging/ui/appsettings/SimMessagesV2FragmentPeer$DeleteMessageCallback", "onFailure", 473, "SimMessagesV2FragmentPeer.java")).t("SimMessagesActivity: delete failure %d", (Integer) obj);
            d();
        }
    }

    /* compiled from: PG */
    public final class b implements ellf {
        public final View a;

        public b(View view) {
            this.a = view;
        }
    }

    public cxfr(cxfj cxfjVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, String str) {
        this.c = cxfjVar;
        this.d = ffbrVar;
        this.e = ffbrVar2;
        this.f = ffbrVar3;
        this.g = ffbrVar4;
        this.h = ffbrVar5;
        this.i = ffbrVar6;
        this.j = ffbrVar7;
        this.k = Integer.parseInt(str);
    }

    public final void a() {
        cxeq.a(((SimMessagesActivity) this.c.G()).H().a);
    }

    public final void b(int i) {
        this.n = i;
        this.m.p();
    }

    public final boolean c() {
        return this.n >= 0;
    }
}
