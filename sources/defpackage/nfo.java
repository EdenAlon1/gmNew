package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nfo {
    public final ByteArrayOutputStream a;
    public final DataOutputStream b;

    public nfo() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.a = byteArrayOutputStream;
        this.b = new DataOutputStream(byteArrayOutputStream);
    }

    public static void a(DataOutputStream dataOutputStream, String str) {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }
}
