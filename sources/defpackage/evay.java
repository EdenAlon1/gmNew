package defpackage;

import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evay {
    public String a;
    public evaz c;
    public String f;
    public final enkg b = new enct();
    public boolean d = true;
    public int e = 3;
    public boolean g = false;
    public Long h = null;
    public final Set i = new HashSet();
    Integer j = null;
    Integer k = null;

    public final evba a() {
        emxf.m(true, "Only one of postBodyData or chunkedStreamFactory should be set");
        return new evba(this);
    }

    public final void b(enkg enkgVar) {
        this.b.C(enkgVar);
    }

    public final void c(String str) {
        boolean z = true;
        if (!str.equals("GET") && !str.equals("HEAD") && !str.equals("DELETE") && !str.equals("POST") && !str.equals("PUT")) {
            z = false;
        }
        emxf.l(z);
        this.f = str;
    }

    public final void d(String str, ByteBuffer byteBuffer) {
        str.getClass();
        byteBuffer.getClass();
        boolean z = true;
        if (!byteBuffer.isDirect() && byteBuffer.isReadOnly()) {
            z = false;
        }
        emxf.m(z, "Post body cannot be a ByteBuffer that is non-direct and readonly");
        this.c = new evaz(str, byteBuffer);
    }

    public final void e(String str) {
        str.getClass();
        this.a = str;
    }
}
