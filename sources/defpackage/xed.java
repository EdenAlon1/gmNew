package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xed extends ffhv implements ffjn {
    /* synthetic */ Object a;
    /* synthetic */ Object b;

    public xed(ffgu ffguVar) {
        super(3, ffguVar);
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        xed xedVar = new xed((ffgu) obj3);
        xedVar.a = (engw) obj;
        xedVar.b = (alxj) obj2;
        return xedVar.b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [alxj, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        Object obj2 = this.a;
        boolean z = false;
        if (this.b.b() == alxi.ONE_ON_ONE) {
            engw engwVar = (engw) obj2;
            if (engwVar.size() == 1 && ((ResolvedRecipient) engwVar.get(0)).g().A()) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}
