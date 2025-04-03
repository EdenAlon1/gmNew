package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyfe extends ffhv implements ffjn {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    final /* synthetic */ cyff c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cyfe(cyff cyffVar, ffgu ffguVar) {
        super(3, ffguVar);
        this.c = cyffVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        cyfe cyfeVar = new cyfe(this.c, (ffgu) obj3);
        cyfeVar.a = (engw) obj;
        cyfeVar.b = (alxj) obj2;
        return cyfeVar.b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [alxj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.Collection] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ?? r5 = this.a;
        ?? r0 = this.b;
        aqux f = r0.f();
        return new cyfl(f != null && f.v() && r0.b() == alxi.ONE_ON_ONE && !r5.isEmpty() && ((ResolvedRecipient) ((engw) r5).get(0)).g().D(), !r5.isEmpty() ? (ResolvedRecipient) ((engw) r5).get(0) : null);
    }
}
