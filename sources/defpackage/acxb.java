package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.dittosatellite.impl.DittoWebActivity;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acxb implements acxa {
    private final cinl a;
    private final acwq b;
    private final acws c;
    private final acxd d;
    private final Object e = new Object();
    private final Map f = new HashMap();
    private final Map g = new HashMap();
    private final knr h;
    private final Context i;

    public acxb(Context context, cinl cinlVar, acwq acwqVar, acws acwsVar, acxd acxdVar) {
        this.a = cinlVar;
        this.i = context;
        this.b = acwqVar;
        this.c = acwsVar;
        this.d = acxdVar;
        knq knqVar = new knq();
        knqVar.d = "bugle_dittosatellite_self_person";
        knqVar.a = context.getResources().getString(R.string.self_person_name);
        knqVar.e = false;
        this.h = new knr(knqVar);
    }

    @Override // defpackage.acxa
    public final knr a() {
        return this.h;
    }

    @Override // defpackage.acxa
    public final void b() {
        synchronized (this.e) {
            Iterator it = this.f.values().iterator();
            while (it.hasNext()) {
                ((acwp) it.next()).b();
            }
            this.f.clear();
            Iterator it2 = this.g.values().iterator();
            while (it2.hasNext()) {
                ((acxc) it2.next()).e();
            }
            this.g.clear();
        }
    }

    @Override // defpackage.acxa
    public final void c(String str) {
        synchronized (this.e) {
            acwp acwpVar = (acwp) this.f.remove(str);
            if (acwpVar != null) {
                acwpVar.b();
            }
        }
    }

    @Override // defpackage.acxa
    public final void d(String str, String str2, esol esolVar, kmz kmzVar) {
        synchronized (this.e) {
            if (!this.f.containsKey(str)) {
                Map map = this.f;
                acwq acwqVar = this.b;
                aclr aclrVar = new aclr(str);
                knr knrVar = this.h;
                cinl cinlVar = (cinl) acwqVar.a.b();
                cinlVar.getClass();
                Context context = (Context) acwqVar.b.b();
                context.getClass();
                cthp cthpVar = (cthp) acwqVar.c.b();
                cthpVar.getClass();
                str2.getClass();
                esolVar.getClass();
                map.put(str, new acwp(cinlVar, context, cthpVar, aclrVar, str2, esolVar, knrVar));
            }
            acwp acwpVar = (acwp) this.f.get(str);
            cml cmlVar = acwpVar.e;
            if (cmlVar.a() == 7) {
                int i = cmlVar.b;
                if (i == cmlVar.c) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                Object[] objArr = cmlVar.a;
                Object obj = objArr[i];
                objArr[i] = null;
                cmlVar.b = (i + 1) & cmlVar.d;
            }
            Object[] objArr2 = cmlVar.a;
            int i2 = cmlVar.c;
            objArr2[i2] = kmzVar;
            int i3 = cmlVar.d & (i2 + 1);
            cmlVar.c = i3;
            int i4 = cmlVar.b;
            if (i3 == i4) {
                int length = objArr2.length;
                int i5 = length - i4;
                int i6 = length + length;
                if (i6 < 0) {
                    throw new RuntimeException("Max array capacity exceeded");
                }
                Object[] objArr3 = new Object[i6];
                ffdo.n(objArr2, objArr3, 0, i4, length);
                ffdo.n(cmlVar.a, objArr3, i5, 0, cmlVar.b);
                cmlVar.a = objArr3;
                cmlVar.b = 0;
                cmlVar.c = length;
                cmlVar.d = i6 - 1;
            }
            acwpVar.f.incrementAndGet();
            if (acwpVar.g) {
                acwpVar.c.f(acwpVar.a());
            } else {
                acwpVar.g = true;
                acwpVar.c.d(acwpVar.a());
            }
        }
    }

    @Override // defpackage.acxa
    public final void e(final acwn acwnVar) {
        final acws acwsVar = this.c;
        this.a.d(acwsVar.b.a(new ciql() { // from class: acwr
            @Override // defpackage.ciql
            public final Notification a(String str) {
                acws acwsVar2 = acws.this;
                Resources resources = acwsVar2.a.getResources();
                acwl acwlVar = (acwl) acwnVar;
                ciox c = ciox.c(resources, null, acwlVar.d, 1, 1, 1);
                Intent a = akuv.c(acwsVar2.a, DittoWebActivity.class, "android.intent.action.VIEW").a();
                a.setFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
                a.putExtra("conversation_id_for_launch", acwlVar.c.toString());
                PendingIntent a2 = eepf.a(acwsVar2.a, 0, a, ctie.a(1073741824));
                Intent a3 = akuv.c(acwsVar2.a, acwz.class, "com.google.android.apps.messaging.SATELLITE_RETRY_MESSAGE_REPLY").a();
                a3.putExtra("bugle_dittosatellite_conversation_proto", acwlVar.e.I());
                a3.putExtra("bugle_dittosatellite_reply_conversation_id", acwlVar.c.toString());
                a3.putExtra("bugle_dittosatellite_reply_conversation_name", acwlVar.d);
                a3.putExtra("bugle_dittosatellite_reply_text", acwlVar.b);
                a3.putExtra("bugle_dittosatellite_reply_retry_count", acwlVar.a + 1);
                PendingIntent d = eepf.d(acwsVar2.a, 0, a3, VCardConfig.FLAG_APPEND_TYPE_PARAM);
                kml kmlVar = new kml(acwsVar2.a, "");
                kmlVar.g = a2;
                kmlVar.F = str;
                kmlVar.e(new klz(R.drawable.notification_icon, acwsVar2.a.getString(R.string.retry_button_label), d).a());
                kmlVar.r(R.drawable.notification_icon);
                cimx cimxVar = (cimx) c;
                kmlVar.i(cimxVar.a);
                kmlVar.w(cimxVar.a);
                kmlVar.h(cimxVar.b);
                return kmlVar.a();
            }
        }, cinj.SATELLITE_MESSAGE_SEND_FAILURE));
    }

    @Override // defpackage.acxa
    public final void f(String str, String str2, String str3) {
        acxd acxdVar = this.d;
        cinl cinlVar = (cinl) acxdVar.a.b();
        cinlVar.getClass();
        Context context = (Context) acxdVar.b.b();
        context.getClass();
        cthp cthpVar = (cthp) acxdVar.c.b();
        cthpVar.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        acxc acxcVar = new acxc(cinlVar, context, cthpVar, str, str2, str3);
        synchronized (this.e) {
            acxc acxcVar2 = (acxc) this.g.remove(str);
            if (acxcVar2 != null) {
                acxcVar2.e();
            }
            this.g.put(str, acxcVar);
        }
        acxcVar.a.d(acxcVar);
    }

    @Override // defpackage.acxa
    public final boolean g() {
        return ctid.f && this.i.checkSelfPermission("android.permission.POST_NOTIFICATIONS") != 0;
    }
}
