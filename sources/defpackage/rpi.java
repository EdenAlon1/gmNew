package defpackage;

import android.content.Context;
import android.net.Credentials;
import android.net.LocalSocket;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rpi extends Thread {
    private final LocalSocket a;
    private final rpq b;

    public rpi(LocalSocket localSocket, rpq rpqVar) {
        this.a = localSocket;
        this.b = rpqVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        LocalSocket localSocket;
        rpq a;
        Context context;
        int uid;
        int pid;
        try {
            try {
                rpq rpqVar = this.b;
                localSocket = this.a;
                a = ((rpg) rpqVar).a();
                try {
                    context = ((rpo) a).b;
                    Credentials peerCredentials = localSocket.getPeerCredentials();
                    uid = peerCredentials.getUid();
                    pid = peerCredentials.getPid();
                    if (roi.f(2)) {
                        String a2 = roi.a("Got request from uid=%d, pid=%d", Integer.valueOf(uid), Integer.valueOf(pid));
                        if (roi.f(2)) {
                            roh.c(2, a2);
                        }
                    }
                } catch (rpk e) {
                    roh.b("Unauthorized request: ".concat(String.valueOf(e.getMessage())));
                }
            } catch (IOException e2) {
                roi.d(roi.a("I/O error: %s", e2));
            }
            if (context.checkPermission("android.permission.DUMP", pid, uid) != 0) {
                throw new rpk("Peer pid=" + pid + ", uid=" + uid + " does not have android.permission.DUMP");
            }
            rph rphVar = new rph(localSocket.getInputStream(), 256);
            if (((rpn) a).a.isEmpty()) {
                throw new IllegalStateException("No handlers added");
            }
            int size = ((rpn) a).a.size();
            for (int i = 0; i < size; i++) {
                rpm rpmVar = (rpm) ((rpn) a).a.get(i);
                rphVar.mark(256);
                rpl rplVar = rpmVar.b;
                int length = rplVar.a.length;
                byte[] bArr = new byte[length];
                boolean z = rphVar.read(bArr) == length && Arrays.equals(bArr, rplVar.a);
                rphVar.reset();
                if (z) {
                    rpmVar.a.a(new rpr(localSocket, rphVar));
                    try {
                        return;
                    } catch (IOException unused) {
                        return;
                    }
                }
            }
            throw new IOException("No matching handler, firstByte=" + rphVar.read());
        } finally {
            try {
                this.a.close();
            } catch (IOException unused2) {
            }
        }
    }
}
