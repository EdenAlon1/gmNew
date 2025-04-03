package defpackage;

import android.database.Cursor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class dysb implements emwl {
    @Override // defpackage.emwl
    public final Object apply(Object obj) {
        Cursor cursor = (Cursor) obj;
        if (cursor.getPosition() != -1 || cursor.moveToFirst()) {
            dzmj dzmjVar = new dzmj();
            dzmjVar.b(true);
            return dzmjVar.a();
        }
        dzmj dzmjVar2 = new dzmj();
        dzmjVar2.b(false);
        return dzmjVar2.a();
    }
}
