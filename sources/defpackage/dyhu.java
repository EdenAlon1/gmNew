package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyhu {
    public static Bitmap a(byte[] bArr) {
        try {
            return BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        } catch (Exception e) {
            dyhr.d("SerializeUtil", "failed to deserialize bitmap", e);
            return null;
        }
    }

    public static emxc b(Object obj) {
        try {
            return emxc.j((HashMap) obj);
        } catch (ClassCastException unused) {
            return emux.a;
        }
    }

    public static eyee c(String str) {
        return eyee.x(k(str));
    }

    public static Object d(byte[] bArr) {
        return new ObjectInputStream(new ByteArrayInputStream(bArr)).readObject();
    }

    public static String e(eyee eyeeVar) {
        return f(eyeeVar.I());
    }

    public static String f(byte[] bArr) {
        return Base64.encodeToString(bArr, 2);
    }

    public static HashMap g(byte[] bArr) {
        try {
            Object d = d(bArr);
            return d instanceof HashMap ? (HashMap) d : new HashMap();
        } catch (IOException | ClassNotFoundException e) {
            dyhr.d("SerializeUtil", "Error reading properties.", e);
            dyhr.a("SerializeUtil", String.format("Error reading properties with contents: %s", new String(bArr)));
            return new HashMap();
        }
    }

    public static HashMap h(byte[] bArr) {
        try {
            Object d = d(bArr);
            if (d instanceof HashMap) {
                for (byte[] bArr2 : ((HashMap) d).values()) {
                }
                return (HashMap) d;
            }
        } catch (IOException | ClassCastException | ClassNotFoundException e) {
            dyhr.d("SerializeUtil", "Error reading property bytes.", e);
            dyhr.a("SerializeUtil", String.format("Error reading property bytes with contents: %s", new String(bArr)));
        }
        return new HashMap();
    }

    public static byte[] i(Serializable serializable) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream.writeObject(serializable);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                objectOutputStream.close();
                byteArrayOutputStream.close();
                return byteArray;
            } finally {
            }
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static byte[] j(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static byte[] k(String str) {
        return Base64.decode(str, 2);
    }
}
