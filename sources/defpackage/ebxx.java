package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.google.android.libraries.onegoogle.owners.mdi.MdiNotAvailableException;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ebxx {
    private final dydd a;
    private final Context b;

    public ebxx(dydd dyddVar, Context context) {
        this.a = dyddVar;
        this.b = context;
    }

    final ListenableFuture a(ebxw ebxwVar, String str, int i) {
        elfl h = elfl.g(ebxwVar.a(this.a.a(new Account(str, "com.google")), new dycx(fdrg.a.get().a(this.b)), ebwf.a(i))).e(dydf.class, new emwl() { // from class: ebxr
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return null;
            }
        }, erpp.a).f(dfqu.class, new eroh() { // from class: ebxs
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                dfqu dfquVar = (dfqu) obj;
                return dfquVar.a() == 17 ? erqt.h(new MdiNotAvailableException.ApiNotConnectedException()) : erqt.h(dfquVar);
            }
        }, erpp.a).f(IOException.class, new eroh() { // from class: ebxt
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                IOException iOException = (IOException) obj;
                dfqu dfquVar = (dfqu) eboa.b(iOException, dfqu.class);
                return (dfquVar == null || dfquVar.a() != 10) ? erqt.h(iOException) : erqt.h(new MdiNotAvailableException.DeveloperErrorException());
            }
        }, erpp.a).h(new emwl() { // from class: ebxu
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                InputStream inputStream = (InputStream) obj;
                if (inputStream == null) {
                    return null;
                }
                Bitmap decodeStream = BitmapFactory.decodeStream(inputStream);
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
                return decodeStream;
            }
        }, erpp.a);
        elfr.l(h, new ebxv(), erpp.a);
        return h;
    }
}
