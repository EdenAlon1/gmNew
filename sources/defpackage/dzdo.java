package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.security.KeyPairGenerator;
import java.security.spec.ECGenParameterSpec;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzdo {
    public final Context a;
    public final dzci b;
    public final dyjf c;

    public dzdo(Context context, dzci dzciVar, dyjf dyjfVar) {
        this.a = context;
        this.b = dzciVar;
        this.c = dyjfVar;
    }

    public static final ListenableFuture a() {
        return dyjm.a(new Callable() { // from class: dzdn
            @Override // java.util.concurrent.Callable
            public final Object call() {
                KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC");
                keyPairGenerator.initialize(new ECGenParameterSpec("secp256r1"));
                return keyPairGenerator.generateKeyPair();
            }
        });
    }
}
