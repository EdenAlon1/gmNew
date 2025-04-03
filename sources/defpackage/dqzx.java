package defpackage;

import android.database.Cursor;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqzx extends ffhv implements ffjn {
    /* synthetic */ Object a;
    final /* synthetic */ drag b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqzx(drag dragVar, ffgu ffguVar) {
        super(3, ffguVar);
        this.b = dragVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        dqzx dqzxVar = new dqzx(this.b, (ffgu) obj3);
        dqzxVar.a = (Cursor) obj2;
        return dqzxVar.b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.database.Cursor, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ?? r2 = this.a;
        r2.getClass();
        return this.b.a(r2);
    }
}
