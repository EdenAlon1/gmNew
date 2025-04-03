package defpackage;

import android.net.Uri;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efem implements efel {
    @Override // defpackage.efel
    public final InputStream a(Uri uri, InputStream inputStream) {
        return new InflaterInputStream(inputStream);
    }

    @Override // defpackage.efel
    public final OutputStream b(Uri uri, OutputStream outputStream) {
        return new DeflaterOutputStream(outputStream);
    }

    @Override // defpackage.efel
    public final String c() {
        return "compress";
    }

    @Override // defpackage.efel
    public final /* synthetic */ OutputStream d(OutputStream outputStream) {
        return efek.a(this, outputStream);
    }

    @Override // defpackage.efel
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.efel
    public final /* synthetic */ void f() {
    }
}
