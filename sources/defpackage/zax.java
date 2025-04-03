package defpackage;

import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zax extends ffhv implements ffjo {
    int a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    /* synthetic */ boolean d;
    final /* synthetic */ zba e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zax(zba zbaVar, ffgu ffguVar) {
        super(4, ffguVar);
        this.e = zbaVar;
    }

    @Override // defpackage.ffjo
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        zax zaxVar = new zax(this.e, (ffgu) obj4);
        zaxVar.b = (engw) obj;
        zaxVar.c = (Optional) obj2;
        zaxVar.d = booleanValue;
        return zaxVar.b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        final ResolvedRecipient resolvedRecipient;
        boolean z;
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            z = this.d;
            resolvedRecipient = (ResolvedRecipient) this.b;
            ffci.b(obj);
        } else {
            ffci.b(obj);
            engw engwVar = (engw) this.b;
            Object obj2 = this.c;
            boolean z2 = this.d;
            ResolvedRecipient resolvedRecipient2 = (ResolvedRecipient) ffdx.U(engwVar);
            if (resolvedRecipient2 == null) {
                return null;
            }
            zba zbaVar = this.e;
            this.b = resolvedRecipient2;
            this.d = z2;
            this.a = 1;
            if (zbaVar.a(resolvedRecipient2, (Optional) obj2, this) == ffhhVar) {
                return ffhhVar;
            }
            resolvedRecipient = resolvedRecipient2;
            z = z2;
        }
        if (!z) {
            return null;
        }
        ((cued) this.e.g.b()).e(1);
        final zba zbaVar2 = this.e;
        String string = zbaVar2.a.getString(R.string.unsubscribe_toolstone);
        string.getClass();
        String string2 = zbaVar2.a.getString(R.string.unsubscribe_toolstone_link);
        string2.getClass();
        return new doqo("ChatbotUnsubscribeToolstone", string, null, ffdx.b(new dlto(dlus.h, ffpc.Q(string, string2, 0, false, 6), ffpc.Q(string, string2, 0, false, 6) + string2.length(), string, new ffji() { // from class: zau
            @Override // defpackage.ffji
            public final Object invoke(Object obj3) {
                final zba zbaVar3 = zba.this;
                ((cued) zbaVar3.g.b()).e(2);
                final ResolvedRecipient resolvedRecipient3 = resolvedRecipient;
                zbaVar3.f.b(new ffji() { // from class: zaw
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj4) {
                        ajiy ajiyVar = (ajiy) obj4;
                        ajiyVar.getClass();
                        zba zbaVar4 = zba.this;
                        return ((cvmu) zbaVar4.e.b()).a(ajiyVar, resolvedRecipient3, zbaVar4.c.d(), cuea.b);
                    }
                });
                return true;
            }
        })), new ffix() { // from class: zav
            @Override // defpackage.ffix
            public final Object invoke() {
                zba zbaVar3 = zba.this;
                ((cued) zbaVar3.g.b()).e(3);
                axol.m(zbaVar3.b, new zay(zbaVar3, resolvedRecipient, null));
                return ffcu.a;
            }
        }, 4);
    }
}
