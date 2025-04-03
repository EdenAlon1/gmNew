package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wui extends ffhv implements ffjp {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    final /* synthetic */ wut d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wui(wut wutVar, ffgu ffguVar) {
        super(5, ffguVar);
        this.d = wutVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [alxj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [alxj, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ?? r3 = this.a;
        Object obj2 = this.b;
        ?? r1 = this.c;
        if (obj2 == null) {
            return this.d.c(r3);
        }
        if (r1 == 0) {
            return null;
        }
        return this.d.c(r1);
    }

    @Override // defpackage.ffjp
    public final /* bridge */ /* synthetic */ Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        wui wuiVar = new wui(this.d, (ffgu) obj5);
        wuiVar.a = (alxj) obj;
        wuiVar.b = (Recipient) obj3;
        wuiVar.c = (alxj) obj4;
        return wuiVar.b(ffcu.a);
    }
}
