package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
final class moi extends Handler {
    final /* synthetic */ mom a;
    private boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public moi(mom momVar, Looper looper) {
        super(looper);
        this.a = momVar;
    }

    final void a(int i, Object obj, boolean z) {
        obtainMessage(i, new moj(mtc.a(), z, SystemClock.elapsedRealtime(), obj)).sendToTarget();
    }

    public final synchronized void b() {
        removeCallbacksAndMessages(null);
        this.b = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Exception exc;
        moj mojVar = (moj) message.obj;
        try {
            int i = message.what;
            String str = null;
            if (i == 1) {
                mpw mpwVar = this.a.i;
                mpr mprVar = (mpr) mojVar.d;
                exc = mpn.c(((lwz) mpwVar.a).a(), a.w(lvf.H(mprVar.a), mprVar.b, "&signedRequest="), null, Collections.EMPTY_MAP);
            } else {
                if (i != 2) {
                    throw new RuntimeException();
                }
                mom momVar = this.a;
                mpw mpwVar2 = momVar.i;
                UUID uuid = momVar.c;
                mpq mpqVar = (mpq) mojVar.d;
                String str2 = mpqVar.b;
                if (true != TextUtils.isEmpty(str2)) {
                    str = str2;
                }
                if (TextUtils.isEmpty(str)) {
                    lwu lwuVar = new lwu();
                    lwuVar.a = Uri.EMPTY;
                    lwuVar.a();
                    throw new mpy(new IllegalStateException("No license URL"));
                }
                HashMap hashMap = new HashMap();
                hashMap.put(fhpi.a, lpn.e.equals(uuid) ? "text/xml" : lpn.c.equals(uuid) ? "application/json" : "application/octet-stream");
                if (lpn.e.equals(uuid)) {
                    hashMap.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
                }
                synchronized (mpwVar2.b) {
                    hashMap.putAll(mpwVar2.b);
                }
                exc = mpn.c(((lwz) mpwVar2.a).a(), str, mpqVar.a, hashMap);
            }
        } catch (mpy e) {
            moj mojVar2 = (moj) message.obj;
            if (mojVar2.b) {
                int i2 = mojVar2.e + 1;
                mojVar2.e = i2;
                if (i2 <= mxw.a(3)) {
                    int i3 = mtc.a;
                    long j = mojVar2.a;
                    SystemClock.elapsedRealtime();
                    SystemClock.elapsedRealtime();
                    long j2 = mojVar2.c;
                    long b = mxw.b(new mxx(e.getCause() instanceof IOException ? (IOException) e.getCause() : new mol(e.getCause()), mojVar2.e));
                    if (b != -9223372036854775807L) {
                        synchronized (this) {
                            if (!this.b) {
                                sendMessageDelayed(Message.obtain(message), b);
                                return;
                            }
                        }
                    }
                }
            }
            exc = e;
        } catch (Exception e2) {
            luj.g("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e2);
            exc = e2;
        }
        long j3 = mojVar.a;
        synchronized (this) {
            if (!this.b) {
                this.a.d.obtainMessage(message.what, Pair.create(mojVar.d, exc)).sendToTarget();
            }
        }
    }
}
