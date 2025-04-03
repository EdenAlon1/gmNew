package defpackage;

import android.content.ContentProviderClient;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejtr {
    public final ejno a;
    public final Context b;
    public final ejvp c;
    public final dlpw d;
    public final elbx e;
    public final Executor f;
    private final errl g;

    public ejtr(ejno ejnoVar, Context context, ejvp ejvpVar, errl errlVar, dlpw dlpwVar, elbx elbxVar, Executor executor) {
        this.a = ejnoVar;
        this.b = context;
        this.c = ejvpVar;
        this.g = errlVar;
        this.d = dlpwVar;
        this.e = elbxVar;
        this.f = executor;
    }

    private static final String[] i(ekrb ekrbVar) {
        try {
            return (String[]) Arrays.copyOf(ekrbVar.b(), ekrbVar.b().length, String[].class);
        } catch (ArrayStoreException e) {
            throw new IllegalArgumentException("AsyncContentResolver cannot be queried with a SafeSQLStatement containing byte array arguments. Only String arguments are allowed.", e);
        }
    }

    public final erph a(Uri uri, String[] strArr, ekrb ekrbVar, String str) {
        strArr.getClass();
        uri.getClass();
        return b(uri, strArr, ekrbVar.a(), i(ekrbVar), str);
    }

    public final erph b(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        strArr.getClass();
        uri.getClass();
        ejtm ejtmVar = new ejtm(this, uri, strArr, str, strArr2, str2);
        int i = efkb.a;
        efjz efjzVar = new efjz(ejtmVar);
        efjzVar.e(this.g);
        return erph.b(efjzVar, erpp.a);
    }

    public final ListenableFuture c(final ejtp ejtpVar) {
        return erqt.m(eldl.m(new Callable() { // from class: ejti
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ejtpVar.a(ejtr.this.a);
            }
        }), this.g);
    }

    public final void d(Uri uri, boolean z, ejte ejteVar) {
        this.b.getContentResolver().registerContentObserver(uri, z, ejteVar);
    }

    public final void e(ejte ejteVar) {
        this.b.getContentResolver().unregisterContentObserver(ejteVar);
    }

    public final ListenableFuture f(final Uri uri, final Bundle bundle) {
        return c(new ejtp() { // from class: ejtg
            @Override // defpackage.ejtp
            public final Object a(ejno ejnoVar) {
                final Bundle bundle2 = bundle;
                return (Bundle) ejnoVar.e(uri, new ejnm() { // from class: ejnd
                    public final /* synthetic */ String a = "garbage_collect";
                    public final /* synthetic */ String b = "";

                    @Override // defpackage.ejnm
                    public final Object a(ContentProviderClient contentProviderClient) {
                        return contentProviderClient.call(this.a, this.b, bundle2);
                    }
                });
            }
        });
    }

    public final ListenableFuture g(final Uri uri, final String str) {
        return c(new ejtp() { // from class: ejtk
            @Override // defpackage.ejtp
            public final Object a(ejno ejnoVar) {
                return Integer.valueOf(ejnoVar.a(uri, str, null));
            }
        });
    }

    public final ListenableFuture h(final Uri uri, final ContentValues contentValues, final String str) {
        return c(new ejtp() { // from class: ejtf
            @Override // defpackage.ejtp
            public final Object a(ejno ejnoVar) {
                final Uri uri2 = uri;
                final ContentValues contentValues2 = contentValues;
                final String str2 = str;
                Integer num = (Integer) ejnoVar.e(uri2, new ejnm() { // from class: ejmv
                    @Override // defpackage.ejnm
                    public final Object a(ContentProviderClient contentProviderClient) {
                        return Integer.valueOf(contentProviderClient.update(uri2, contentValues2, str2, null));
                    }
                });
                num.intValue();
                return num;
            }
        });
    }
}
