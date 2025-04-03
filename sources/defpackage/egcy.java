package defpackage;

import android.net.Uri;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egcy {
    public static final /* synthetic */ int a = 0;
    private static final exgi b;
    private static final exfu c;

    static {
        exgh exghVar = (exgh) exgi.a.createBuilder();
        exghVar.copyOnWrite();
        exgi exgiVar = (exgi) exghVar.instance;
        exgiVar.c = 1;
        exgiVar.b |= 1;
        b = (exgi) exghVar.build();
        exft exftVar = (exft) exfu.a.createBuilder();
        exftVar.copyOnWrite();
        exfu exfuVar = (exfu) exftVar.instance;
        exfuVar.c = 2;
        exfuVar.b = 1 | exfuVar.b;
        c = (exfu) exftVar.build();
    }

    public static exfu a(qwp qwpVar) {
        if (qwpVar != null) {
            for (Throwable th : qwpVar.a()) {
                if (th instanceof qtb) {
                    qtb qtbVar = (qtb) th;
                    exft exftVar = (exft) exfu.a.createBuilder();
                    if (qtbVar.getCause() instanceof SocketTimeoutException) {
                        exftVar.copyOnWrite();
                        exfu exfuVar = (exfu) exftVar.instance;
                        exfuVar.c = 4;
                        exfuVar.b |= 1;
                        exgi exgiVar = b;
                        exftVar.copyOnWrite();
                        exfu exfuVar2 = (exfu) exftVar.instance;
                        exgiVar.getClass();
                        exfuVar2.e = exgiVar;
                        exfuVar2.b |= 4;
                        return (exfu) exftVar.build();
                    }
                    if (qtbVar.getCause() instanceof UnknownHostException) {
                        exftVar.copyOnWrite();
                        exfu exfuVar3 = (exfu) exftVar.instance;
                        exfuVar3.c = 1;
                        exfuVar3.b |= 1;
                        exgi exgiVar2 = b;
                        exftVar.copyOnWrite();
                        exfu exfuVar4 = (exfu) exftVar.instance;
                        exgiVar2.getClass();
                        exfuVar4.e = exgiVar2;
                        exfuVar4.b |= 4;
                        return (exfu) exftVar.build();
                    }
                    exgh exghVar = (exgh) b.toBuilder();
                    long j = qtbVar.a;
                    exghVar.copyOnWrite();
                    exgi exgiVar3 = (exgi) exghVar.instance;
                    exgiVar3.b |= 2;
                    exgiVar3.d = j;
                    exftVar.copyOnWrite();
                    exfu exfuVar5 = (exfu) exftVar.instance;
                    exgi exgiVar4 = (exgi) exghVar.build();
                    exgiVar4.getClass();
                    exfuVar5.e = exgiVar4;
                    exfuVar5.b |= 4;
                    int i = qtbVar.a;
                    if (i == 403) {
                        exftVar.copyOnWrite();
                        exfu exfuVar6 = (exfu) exftVar.instance;
                        exfuVar6.c = 16;
                        exfuVar6.b |= 1;
                    } else if (i == 404) {
                        exftVar.copyOnWrite();
                        exfu exfuVar7 = (exfu) exftVar.instance;
                        exfuVar7.c = 5;
                        exfuVar7.b |= 1;
                    } else if (i == 500) {
                        exftVar.copyOnWrite();
                        exfu exfuVar8 = (exfu) exftVar.instance;
                        exfuVar8.c = 13;
                        exfuVar8.b |= 1;
                    }
                    return (exfu) exftVar.build();
                }
            }
        }
        return c;
    }

    public static int b(Object obj) {
        if (obj instanceof Uri) {
            return 3;
        }
        return obj instanceof egam ? 2 : 1;
    }
}
