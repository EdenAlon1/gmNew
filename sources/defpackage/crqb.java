package defpackage;

import android.database.Cursor;

/* compiled from: PG */
/* loaded from: classes8.dex */
final /* synthetic */ class crqb extends ffkh implements ffji {
    public crqb(Object obj) {
        super(1, obj, crqf.class, "readSystemBlockListRow", "readSystemBlockListRow-JfnmSAo(Landroid/database/Cursor;)Ljava/lang/String;", 0);
    }

    @Override // defpackage.ffji
    public final /* synthetic */ Object invoke(Object obj) {
        Cursor cursor = ((ejnp) obj).a;
        int i = crqf.c;
        ekzz f = eleg.f("BlockListResolver#getUpdatedList#queryBugle");
        try {
            String b = ejnp.b(cursor, ejnp.a(cursor, "e164_number"));
            if (b.length() != 0) {
                ffig.a(f, null);
                return b;
            }
            String b2 = ejnp.b(cursor, ejnp.a(cursor, "original_number"));
            if (b2.length() == 0) {
                ffig.a(f, null);
                return "";
            }
            ffig.a(f, null);
            return b2;
        } finally {
        }
    }
}
