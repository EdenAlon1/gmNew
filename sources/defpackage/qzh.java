package defpackage;

import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qzh implements qud {
    private final String a;
    private Object b;

    public qzh(String str) {
        this.a = str;
    }

    @Override // defpackage.qud
    public final Class a() {
        return InputStream.class;
    }

    @Override // defpackage.qud
    public final void e() {
        try {
            ((InputStream) this.b).close();
        } catch (IOException unused) {
        }
    }

    @Override // defpackage.qud
    public final qsy eV() {
        return qsy.LOCAL;
    }

    @Override // defpackage.qud
    public final void g(qqe qqeVar, quc qucVar) {
        try {
            String str = this.a;
            if (!str.startsWith("data:image")) {
                throw new IllegalArgumentException("Not a valid image data URL.");
            }
            int indexOf = str.indexOf(44);
            if (indexOf == -1) {
                throw new IllegalArgumentException("Missing comma in data URL.");
            }
            if (!str.substring(0, indexOf).endsWith(";base64")) {
                throw new IllegalArgumentException("Not a base64 image data URL.");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
            this.b = byteArrayInputStream;
            qucVar.c(byteArrayInputStream);
        } catch (IllegalArgumentException e) {
            qucVar.f(e);
        }
    }

    @Override // defpackage.qud
    public final void d() {
    }
}
