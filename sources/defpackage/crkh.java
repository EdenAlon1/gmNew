package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsDataImpl;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crkh {
    public static final cskc a = cskc.g("Bugle", "MessageFailureOptionsBottomModalFragment");
    private static final enru r = enru.c("com/google/android/apps/messaging/shared/ui/fallback/MessageFailureOptionsBottomModalFragmentPeer");
    private final ffbr A;
    private final ffbr B;
    private final ffbr C;
    public final MessageIdType b;
    public final String c;
    public final ezxe d;
    public final boolean e;
    public final boolean f;
    public final int g;
    public final crka h;
    public final cgrq i;
    public final bbfg j;
    public final akzt k;
    public final ffbr l;
    public final ffbr m;
    public final asix n;
    public final ffbr o;
    public View p;
    public final bzyb q;
    private final boolean s;
    private final boolean t;
    private final boolean u;
    private final SelfIdentityId v;
    private final Context w;
    private final elbx x;
    private final csjk y;
    private final ffbr z;

    public crkh(ezxf ezxfVar, Context context, crka crkaVar, cgrq cgrqVar, bbfg bbfgVar, elbx elbxVar, akzt akztVar, bzyb bzybVar, csjk csjkVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, asix asixVar, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7) {
        this.b = bdhb.b(ezxfVar.c);
        this.c = ezxfVar.d;
        ezxe b = ezxe.b(ezxfVar.e);
        this.d = b == null ? ezxe.UNKNOWN : b;
        this.s = ezxfVar.j;
        this.e = ezxfVar.f;
        this.t = ezxfVar.g;
        this.u = ezxfVar.h;
        this.v = aqvf.b(ezxfVar.i);
        this.g = ezxfVar.l;
        this.w = context;
        this.h = crkaVar;
        this.i = cgrqVar;
        this.j = bbfgVar;
        this.x = elbxVar;
        this.k = akztVar;
        this.q = bzybVar;
        this.y = csjkVar;
        this.z = ffbrVar;
        this.A = ffbrVar2;
        this.l = ffbrVar3;
        this.f = ezxfVar.k;
        this.m = ffbrVar4;
        this.n = asixVar;
        this.o = ffbrVar5;
        this.B = ffbrVar6;
        this.C = ffbrVar7;
    }

    public static void f(View view, String str) {
        view.findViewById(R.id.message_send_in_progress_row).setVisibility(0);
        ((TextView) view.findViewById(R.id.message_send_in_progress_text_view)).setText(str);
    }

    private final void n(TextView textView, boolean z) {
        int color = this.w.getColor(R.color.bottom_sheet_icon);
        for (Drawable drawable : textView.getCompoundDrawablesRelative()) {
            if (drawable != null) {
                drawable.setTint(color);
                if (z) {
                    drawable.setAlpha(PrivateKeyType.INVALID);
                } else {
                    drawable.setAlpha(138);
                }
            }
        }
    }

    public final int a() {
        int ordinal = this.d.ordinal();
        if (ordinal == 2) {
            return 1;
        }
        if (ordinal != 3) {
            return ordinal != 4 ? 3 : 2;
        }
        return 0;
    }

    public final void b(View view, String str) {
        TextView textView = (TextView) view.findViewById(R.id.delete_message_option_row);
        textView.setVisibility(0);
        textView.setText(str);
        textView.setOnClickListener(new elay(this.x, "messageFailureOptionsBottomModalFragment:Delete message click", new View.OnClickListener() { // from class: crkd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                crkh crkhVar = crkh.this;
                crkhVar.k.e("Bugle.Message.Tap.Action.Delete.Counts", crkhVar.a());
                if (crkhVar.n.a()) {
                    crkhVar.i.g(crkhVar.b, cgrr.MESSAGE_NOT_DELIVERED_PHONE_DELETION);
                } else {
                    crkhVar.i.e(crkhVar.b);
                }
                crkhVar.h.hw();
            }
        }));
        n(textView, true);
    }

    public final void c(View view) {
        g(view);
        d(view, view.getResources().getString(R.string.fail_to_send_fallback_description));
        b(view, view.getResources().getString(R.string.fail_to_send_delete_description));
    }

    public final void d(View view, String str) {
        if (k() && this.u && !this.t) {
            csjb a2 = a.a();
            a2.I("Enable fallback option in bottom sheet");
            a2.r();
            View findViewById = view.findViewById(R.id.fallback_message_option_row);
            findViewById.setVisibility(0);
            aztg d = ((bdtd) this.A.b()).d(this.v);
            if (csod.AVAILABLE == ((csmz) this.y.a()).d(0, d == null ? -1 : d.e())) {
                if (str != null) {
                    ((TextView) view.findViewById(R.id.fallback_message_option_text_view)).setText(str);
                }
                findViewById.setOnClickListener(new elay(this.x, "messageFailureOptionsBottomModalFragment:Initiate xMS fallback click", new View.OnClickListener() { // from class: crkb
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        crkh crkhVar = crkh.this;
                        crkhVar.h.hw();
                        crkhVar.k.e("Bugle.Message.Tap.Action.Fallback.Counts", crkhVar.a());
                        axnw.h(((aqgl) crkhVar.o.b()).b(crkhVar.b, eokl.MANUAL_RETRY_FORCES_FALLBACK));
                    }
                }));
                TextView textView = (TextView) view.findViewById(R.id.fallback_message_icon_text_view);
                Drawable drawable = this.w.getDrawable(R.drawable.ic_compose_send);
                if (drawable != null) {
                    drawable.setTint(this.w.getColor(R.color.bottom_sheet_icon));
                    textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, drawable, (Drawable) null, (Drawable) null);
                    return;
                }
                return;
            }
            Context z = this.h.z();
            findViewById.setEnabled(false);
            findViewById.setOnClickListener(null);
            String string = z.getString(R.string.device_xms_connection_unavailable);
            TextView textView2 = (TextView) findViewById.findViewById(R.id.fallback_message_option_text_view);
            textView2.setEnabled(false);
            textView2.setText(string);
            textView2.setAlpha(0.54f);
            TextView textView3 = (TextView) findViewById.findViewById(R.id.fallback_message_icon_text_view);
            textView3.setEnabled(false);
            textView3.setAlpha(0.54f);
            n(textView3, false);
        }
    }

    public final void e(View view) {
        if (l()) {
            f(view, view.getResources().getString(R.string.device_waiting_for_connection));
        } else {
            j(view);
        }
    }

    public final void g(View view) {
        if (m()) {
            h(view);
        } else {
            e(view);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(android.view.View r7) {
        /*
            r6 = this;
            r0 = 2131429884(0x7f0b09fc, float:1.8481453E38)
            android.view.View r0 = r7.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            r0.setVisibility(r1)
            boolean r2 = r6.e
            r3 = 1
            if (r2 == 0) goto L18
            boolean r2 = r6.s
            if (r2 == 0) goto L18
            r2 = r3
            goto L19
        L18:
            r2 = r1
        L19:
            ffbr r4 = r6.m
            java.lang.Object r4 = r4.b()
            bzqa r4 = (defpackage.bzqa) r4
            boolean r4 = r4.i()
            if (r4 == 0) goto L33
            ezxe r4 = r6.d
            ezxe r5 = defpackage.ezxe.ERROR_GROUP_FTD_OPTIONS
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L33
            r4 = r3
            goto L34
        L33:
            r4 = r1
        L34:
            if (r2 == 0) goto L39
            if (r4 != 0) goto L39
            r1 = r3
        L39:
            if (r1 == 0) goto L47
            bzyb r2 = r6.q
            r5 = 40
            android.graphics.drawable.Drawable r2 = r2.a(r5)
            r5 = 0
            r0.setCompoundDrawablesRelativeWithIntrinsicBounds(r2, r5, r5, r5)
        L47:
            if (r4 != 0) goto L73
            boolean r2 = r6.e
            if (r2 == 0) goto L52
            boolean r2 = r6.s
            if (r2 != 0) goto L52
            goto L73
        L52:
            bzyb r2 = r6.q
            android.content.res.Resources r7 = r7.getResources()
            r4 = 2132084314(0x7f15065a, float:1.9808795E38)
            java.lang.String r7 = r7.getString(r4)
            boolean r4 = r6.e
            if (r4 == 0) goto L7e
            boolean r4 = defpackage.bzwd.f()
            if (r4 == 0) goto L7e
            android.content.Context r7 = r2.a
            r2 = 2132084002(0x7f150522, float:1.9808162E38)
            java.lang.String r7 = r7.getString(r2)
            goto L7e
        L73:
            android.content.res.Resources r7 = r7.getResources()
            r2 = 2132087347(0x7f151233, float:1.9814947E38)
            java.lang.String r7 = r7.getString(r2)
        L7e:
            r0.setText(r7)
            elbx r7 = r6.x
            crkf r2 = new crkf
            r2.<init>()
            elay r1 = new elay
            java.lang.String r4 = "messageFailureOptionsBottomModalFragment:Resend message click"
            r1.<init>(r7, r4, r2)
            r0.setOnClickListener(r1)
            r6.n(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crkh.h(android.view.View):void");
    }

    public final void i(View view, String str) {
        TextView textView = (TextView) view.findViewById(R.id.resend_xms_message_option_row);
        textView.setText(str);
        textView.setVisibility(0);
        textView.setOnClickListener(new elay(this.x, "messageFailureOptionsBottomModalFragment:Resend xms message click", new View.OnClickListener() { // from class: crkg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                MessageUsageStatisticsDataImpl messageUsageStatisticsDataImpl = new MessageUsageStatisticsDataImpl();
                crkh crkhVar = crkh.this;
                crkhVar.j.b(crkhVar.b, messageUsageStatisticsDataImpl);
                crkhVar.h.hw();
            }
        }));
        n(textView, true);
    }

    public final void j(View view) {
        TextView textView = (TextView) view.findViewById(R.id.turn_on_data_setting_row);
        textView.setVisibility(0);
        textView.setOnClickListener(new View.OnClickListener() { // from class: crke
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                crkh crkhVar = crkh.this;
                crkhVar.k.e("Bugle.Message.Tap.Action.DataSetting.Counts", crkhVar.a());
                crkhVar.h.G().startActivity(new Intent("android.settings.WIRELESS_SETTINGS"));
                crkhVar.h.hw();
            }
        });
        n(textView, true);
    }

    public final boolean k() {
        return byyr.c(this.g);
    }

    public final boolean l() {
        return dksg.a(this.w);
    }

    public final boolean m() {
        if (!((atrf) this.C.b()).a()) {
            aztg d = ((bdtd) this.A.b()).d(this.v);
            return d != null ? ((ckds) this.z.b()).J(d.e()) : ((ckds) this.z.b()).I();
        }
        aztg f = ((bdtd) this.A.b()).f(this.v);
        if (f != null) {
            return ((clws) this.B.b()).o(f.e());
        }
        ensk j = r.j();
        j.Y(ente.a, "Bugle");
        ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/ui/fallback/MessageFailureOptionsBottomModalFragmentPeer", "isRcsReady", 381, "MessageFailureOptionsBottomModalFragmentPeer.java")).q("Self identity is missing in the message failure UI. Deeming RCS not available.");
        return false;
    }
}
