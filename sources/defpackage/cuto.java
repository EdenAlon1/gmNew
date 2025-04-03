package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cuto extends ffhv implements ffjm {
    final /* synthetic */ cutp a;
    final /* synthetic */ Uri b;
    final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cuto(cutp cutpVar, Uri uri, String str, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = cutpVar;
        this.b = uri;
        this.c = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cuto) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        int i;
        ffci.b(obj);
        cutp cutpVar = this.a;
        Context context = cutpVar.b;
        Uri uri = this.b;
        AssetFileDescriptor a = eepn.a(context, uri, "r", cutpVar.c(uri));
        String str = this.c;
        try {
            a.getClass();
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.reset();
            FileInputStream createInputStream = a.createInputStream();
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = createInputStream.read(bArr);
                    if (read <= 0) {
                        break;
                    }
                    messageDigest.update(bArr, 0, read);
                }
                ffig.a(createInputStream, null);
                byte[] digest = messageDigest.digest();
                digest.getClass();
                ffji ffjiVar = new ffji() { // from class: cute
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj2) {
                        Byte b = (Byte) obj2;
                        b.byteValue();
                        String format = String.format("%02x", Arrays.copyOf(new Object[]{b}, 1));
                        format.getClass();
                        return format;
                    }
                };
                StringBuilder sb = new StringBuilder();
                sb.append((CharSequence) "");
                int i2 = 0;
                for (byte b : digest) {
                    i2++;
                    if (i2 > 1) {
                        sb.append((CharSequence) "");
                    }
                    sb.append((CharSequence) ffjiVar.invoke(Byte.valueOf(b)));
                }
                sb.append((CharSequence) "");
                Boolean valueOf = Boolean.valueOf(ffkj.e(sb.toString(), str));
                ffig.a(a, null);
                return valueOf;
            } finally {
            }
        } finally {
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cuto(this.a, this.b, this.c, ffguVar);
    }
}
