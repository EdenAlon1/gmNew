package defpackage;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejmp extends ejmh {
    public final ContentResolver a;
    public final ejno b;
    private final ffhd c;

    public ejmp(ffhd ffhdVar, ContentResolver contentResolver, ejno ejnoVar) {
        ffhdVar.getClass();
        this.c = ffhdVar;
        this.a = contentResolver;
        this.b = ejnoVar;
    }

    @Override // defpackage.ejmh
    public final Object a(Uri uri, String str, String[] strArr, ffgu ffguVar) {
        return ffra.a(ekxi.a(this.c), new ejmk(null, this, uri, str, strArr), ffguVar);
    }

    @Override // defpackage.ejmh
    public final Object b(Uri uri, ContentValues contentValues, ffgu ffguVar) {
        return ffra.a(ekxi.a(this.c), new ejml(null, this, uri, contentValues), ffguVar);
    }

    @Override // defpackage.ejmh
    public final Object c(final Uri uri, final String[] strArr, final Bundle bundle, final ffji ffjiVar, ffgu ffguVar) {
        return ejmu.b(this.c, new ffji() { // from class: ejmj
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                final CancellationSignal cancellationSignal = (CancellationSignal) obj;
                cancellationSignal.getClass();
                final String[] strArr2 = strArr;
                final Uri uri2 = uri;
                final Bundle bundle2 = bundle;
                Cursor b = ejmp.this.b.b(uri2, strArr2, new ejnf() { // from class: ejmx
                    @Override // defpackage.ejnf
                    public final Cursor a(ContentProviderClient contentProviderClient) {
                        Cursor query;
                        query = contentProviderClient.query(uri2, strArr2, bundle2, cancellationSignal);
                        return query;
                    }
                }, new emyl() { // from class: ejmy
                    @Override // defpackage.emyl
                    public final Object get() {
                        String[] strArr3 = strArr2;
                        Bundle bundle3 = bundle2;
                        return ejno.f(strArr3, uri2, bundle3.getString("android:query-arg-sql-selection"), bundle3.getString("android:query-arg-sql-sort-order"));
                    }
                });
                try {
                    engw a = ejmu.a(b, ffjiVar);
                    ffig.a(b, null);
                    return a;
                } finally {
                }
            }
        }, ffguVar);
    }

    @Override // defpackage.ejmh
    public final ffxx d(Uri uri) {
        return ffyo.a(new ffxn(new ejmo(this, uri, null)));
    }

    @Override // defpackage.ejmh
    public final Object e(final Uri uri, final String[] strArr, final String str, final ffji ffjiVar, ffgu ffguVar) {
        return ejmu.b(this.c, new ffji() { // from class: ejmi
            public final /* synthetic */ String e = "date ASC";

            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                CancellationSignal cancellationSignal = (CancellationSignal) obj;
                cancellationSignal.getClass();
                Cursor c = ejmp.this.b.c(uri, strArr, str, null, this.e, cancellationSignal);
                try {
                    engw a = ejmu.a(c, ffjiVar);
                    ffig.a(c, null);
                    return a;
                } finally {
                }
            }
        }, ffguVar);
    }
}
