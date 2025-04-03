package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.HashSet;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amaq {
    public static final cskc a = cskc.g("BugleContacts", "BugleFavoriteContactProvider");
    public final ffbr b;
    final AtomicReference c = new AtomicReference(Optional.empty());
    private final ambi d;
    private final amah e;
    private final errl f;

    public amaq(ambi ambiVar, amah amahVar, errl errlVar, ffbr ffbrVar) {
        this.d = ambiVar;
        this.e = amahVar;
        this.f = errlVar;
        this.b = ffbrVar;
    }

    public static boolean d(Cursor cursor) {
        return cursor.getString(4) == null;
    }

    public final ambh a(Cursor cursor) {
        int i = cursor.getInt(5);
        String string = cursor.getString(4);
        string.getClass();
        ambi ambiVar = this.d;
        Context context = (Context) ambiVar.a.b();
        context.getClass();
        aolr aolrVar = (aolr) ambiVar.b.b();
        aolrVar.getClass();
        return new ambh(context, aolrVar, i, string);
    }

    public final elfl b() {
        return elfo.g(new Callable() { // from class: amao
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i;
                String str;
                amaq amaqVar = amaq.this;
                axvl axvlVar = (axvl) amaqVar.b.b();
                int i2 = 1;
                csrc csrcVar = !((ctud) axvlVar.b.b()).i() ? null : new csrc(axvlVar.a, axvk.b, "account_type NOT IN (\"com.whatsapp\", \"com.google.android.apps.tachyon\") ", true);
                if (csrcVar == null) {
                    int i3 = engw.d;
                    return enou.a;
                }
                int i4 = engw.d;
                engr engrVar = new engr();
                Cursor a2 = csrcVar.a();
                if (a2 != null) {
                    try {
                        if (a2.moveToNext()) {
                            HashSet hashSet = new HashSet();
                            while (!a2.isAfterLast()) {
                                String string = a2.getString(3);
                                string.getClass();
                                while (hashSet.contains(string) && a2.moveToNext()) {
                                    string = a2.getString(3);
                                    string.getClass();
                                }
                                if (a2.isAfterLast()) {
                                    break;
                                }
                                long j = a2.getLong(0);
                                String string2 = a2.getString(3);
                                string2.getClass();
                                hashSet.add(string2);
                                if (amaq.d(a2)) {
                                    engw c = amaqVar.c(a2);
                                    a2.close();
                                    return c;
                                }
                                String b = emxe.b(a2.getString(i2));
                                String string3 = a2.getString(2);
                                engr engrVar2 = new engr();
                                engrVar2.h(amaqVar.a(a2));
                                int i5 = -1;
                                while (a2.moveToNext()) {
                                    String string4 = a2.getString(3);
                                    string4.getClass();
                                    if (string2.equals(string4)) {
                                        if (amaq.d(a2)) {
                                            engw c2 = amaqVar.c(a2);
                                            a2.close();
                                            return c2;
                                        }
                                        engrVar2.h(amaqVar.a(a2));
                                    } else if (i5 == -1) {
                                        i5 = a2.getPosition();
                                    }
                                }
                                if (i5 >= 0) {
                                    a2.moveToPosition(i5);
                                }
                                if (b.length() > 0) {
                                    i = 1;
                                    str = b.substring(0, 1);
                                } else {
                                    i = 1;
                                    str = b;
                                }
                                engrVar.h(ambj.g(j, string2, str, b, engrVar2.g(), string3 == null ? null : Uri.parse(string3)));
                                i2 = i;
                            }
                            engw g = engrVar.g();
                            a2.close();
                            return g;
                        }
                    } finally {
                    }
                }
                engw engwVar = enou.a;
                if (a2 != null) {
                    a2.close();
                }
                return engwVar;
            }
        }, this.f);
    }

    public final engw c(Cursor cursor) {
        cursor.moveToPosition(-1);
        int i = engw.d;
        engr engrVar = new engr();
        while (cursor.moveToNext()) {
            String string = cursor.getString(3);
            string.getClass();
            engrVar.h(string);
        }
        amah amahVar = this.e;
        final engw g = engrVar.g();
        return g.isEmpty() ? enou.a : amahVar.a("getContactsByLookupKeys", new Function() { // from class: amag
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bqzu bqzuVar = (bqzu) obj;
                bqzuVar.aq(new dtrw("contacts.lookup_key", 3, bqzu.at(engw.this), false));
                return bqzuVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }
}
