package defpackage;

import android.database.Cursor;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drad extends ffhv implements ffjn {
    /* synthetic */ Object a;

    public drad(ffgu ffguVar) {
        super(3, ffguVar);
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        drad dradVar = new drad((ffgu) obj3);
        dradVar.a = (Cursor) obj2;
        return dradVar.b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [android.database.Cursor, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ?? r3 = this.a;
        boolean moveToFirst = r3.moveToFirst();
        Cursor cursor = r3;
        if (true != moveToFirst) {
            cursor = null;
        }
        return new Integer(cursor != null ? cursor.getInt(0) : -1);
    }
}
