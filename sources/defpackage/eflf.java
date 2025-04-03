package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eflf implements ffbr {
    private static final Charset d;
    private static final List e;
    public volatile efle c;
    private final String f;
    public final Object b = new Object();
    public final Map a = new HashMap(10);

    static {
        new eflf("");
        d = Charset.forName("UTF-8");
        e = new ArrayList();
    }

    private eflf(String str) {
        this.f = str;
    }

    public static long a(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes(d));
            return ByteBuffer.wrap(messageDigest.digest()).getLong();
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static synchronized eflf e(String str) {
        synchronized (eflf.class) {
            for (eflf eflfVar : e) {
                if (eflfVar.f.equals(str)) {
                    return eflfVar;
                }
            }
            eflf eflfVar2 = new eflf(str);
            e.add(eflfVar2);
            return eflfVar2;
        }
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* synthetic */ Object b() {
        return this.c;
    }

    public final efkw c(String str, efla... eflaVarArr) {
        synchronized (this.b) {
            efkw efkwVar = (efkw) this.a.get(str);
            if (efkwVar != null) {
                efkwVar.f(eflaVarArr);
                return efkwVar;
            }
            efkw efkwVar2 = new efkw(str, this, eflaVarArr);
            this.a.put(efkwVar2.b, efkwVar2);
            return efkwVar2;
        }
    }

    public final efky d(String str, efla... eflaVarArr) {
        synchronized (this.b) {
            efky efkyVar = (efky) this.a.get(str);
            if (efkyVar != null) {
                efkyVar.f(eflaVarArr);
                return efkyVar;
            }
            efky efkyVar2 = new efky(str, this, eflaVarArr);
            this.a.put(efkyVar2.b, efkyVar2);
            return efkyVar2;
        }
    }
}
