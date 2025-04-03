package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
final class moo extends Handler {
    final /* synthetic */ mow a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public moo(mow mowVar, Looper looper) {
        super(looper);
        this.a = mowVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        byte[] bArr = (byte[]) message.obj;
        if (bArr == null) {
            return;
        }
        for (mom momVar : this.a.c) {
            momVar.k();
            if (Arrays.equals(momVar.f, bArr)) {
                if (message.what == 2 && momVar.e == 4) {
                    int i = lvf.a;
                    momVar.f(false);
                    return;
                }
                return;
            }
        }
    }
}
