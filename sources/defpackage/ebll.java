package defpackage;

import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import com.google.android.apps.messaging.R;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ebll {
    /* JADX WARN: Multi-variable type inference failed */
    public static engw a(Context context, final ebbb ebbbVar, ezoo ezooVar) {
        ebfp ebfpVar;
        engr engrVar = new engr();
        ebbg ebbgVar = (ebbg) ebbbVar;
        ebom ebomVar = new ebom(ebbgVar.f, ezooVar, ebbgVar.b);
        ebfp a = ebbn.a(ebbbVar, context);
        if (a != null) {
            ebon ebonVar = new ebon(((ebfs) a).f);
            DevicePolicyManager devicePolicyManager = (DevicePolicyManager) context.getSystemService("device_policy");
            int i = 41;
            if (devicePolicyManager == null) {
                Log.e(ebbn.a, "Failed to get DevicePolicyManager");
            } else {
                List<ComponentName> activeAdmins = devicePolicyManager.getActiveAdmins();
                if (activeAdmins != null) {
                    Iterator<ComponentName> it = activeAdmins.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (devicePolicyManager.isProfileOwnerApp(it.next().getPackageName())) {
                            i = 42;
                            break;
                        }
                    }
                }
            }
            ebonVar.a(ebomVar, i);
            engrVar.h(a.j(new ebol(ebonVar)));
        }
        Object a2 = ebbgVar.b.a();
        ebfp ebfpVar2 = null;
        if (!((ebgd) ebbgVar.e).f.g() || a2 == null) {
            ebfpVar = null;
        } else {
            emxc emxcVar = ((ebgd) ebbgVar.e).f;
            eave eaveVar = ebbgVar.c;
            Object c = emxcVar.c();
            eaveVar.a(a2);
            final ebbc ebbcVar = ebbgVar.b;
            Drawable a3 = ku.a(context, R.drawable.quantum_gm_ic_no_accounts_vd_theme_24);
            a3.getClass();
            ebfn h = ebfp.h();
            h.f(R.id.og_use_without_an_account);
            ebfr ebfrVar = (ebfr) h;
            ebfrVar.a = a3;
            h.g(context.getString(R.string.og_use_without_an_account));
            h.h(90140);
            h.i(false);
            h.d(((eblc) c).b);
            ebfrVar.b = new View.OnClickListener() { // from class: ebbo
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ebbc.this.h(null);
                }
            };
            ebfpVar = b(h.b(), 6, ebomVar);
        }
        if (ebfpVar != null) {
            engrVar.h(ebfpVar);
        }
        ebno a4 = ebnk.a(ebbgVar.b, ((ebbe) ebbgVar.d).b, context);
        if (a4 != null) {
            ebfn h2 = ebfp.h();
            ebnm ebnmVar = (ebnm) a4;
            h2.f(ebnmVar.a);
            ebfr ebfrVar2 = (ebfr) h2;
            ebfrVar2.a = ebnmVar.b;
            h2.e(ebnmVar.c);
            h2.g(ebnmVar.d);
            h2.d(ebnmVar.g);
            ebfrVar2.b = ebnmVar.f;
            h2.h(ebnmVar.e);
            engrVar.h(b(h2.b(), 11, ebomVar));
        }
        if (ebni.a(context)) {
            ebfn h3 = ebfp.h();
            h3.f(R.id.og_ai_manage_accounts);
            Drawable a5 = ku.a(context, R.drawable.quantum_gm_ic_manage_accounts_vd_theme_24);
            a5.getClass();
            ebfr ebfrVar3 = (ebfr) h3;
            ebfrVar3.a = a5;
            h3.g(context.getString(R.string.og_manage_accounts));
            ebfrVar3.b = new View.OnClickListener() { // from class: ebbl
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ebbg ebbgVar2 = (ebbg) ebbb.this;
                    ((ebbe) ebbgVar2.d).c.a(view, ebbgVar2.b.a());
                }
            };
            h3.h(90142);
            ebfpVar2 = h3.b();
        }
        if (ebfpVar2 != null) {
            engrVar.h(b(ebfpVar2, 12, ebomVar));
        }
        engw g = engrVar.g();
        engr engrVar2 = new engr();
        int i2 = ((enou) g).c;
        for (int i3 = 0; i3 < i2; i3++) {
            final ebcm ebcmVar = new ebcm((ebfp) g.get(i3));
            ebcmVar.j(ebef.ALWAYS_HIDE_DIVIDER_CARD);
            engrVar2.h(new ebcn(new ebcx() { // from class: eblk
                @Override // defpackage.ebcx
                public final ebdf a(Object obj) {
                    return ebcm.this;
                }
            }));
        }
        return engrVar2.g();
    }

    private static ebfp b(ebfp ebfpVar, int i, ebom ebomVar) {
        ebon ebonVar = new ebon(((ebfs) ebfpVar).f);
        ebonVar.a(ebomVar, i);
        return ebfpVar.j(new ebol(ebonVar));
    }
}
