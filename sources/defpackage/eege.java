package defpackage;

import android.content.Context;
import android.os.PowerManager;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.util.function.Function$CC;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.net.SocketTimeoutException;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eege extends Thread {
    private static final dktn b = new dktn("MsrpReceiver");
    public boolean a = false;
    private final InputStream c;
    private final eegq d;
    private final PowerManager.WakeLock e;

    public eege(Context context, eegq eegqVar, InputStream inputStream) {
        this.d = eegqVar;
        this.c = inputStream;
        this.e = dkvi.a(context).newWakeLock(1, "CarrierServices:MsrpReceiver");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v11, types: [eegk, eegq] */
    /* JADX WARN: Type inference failed for: r6v15, types: [eegk, eegq] */
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        eegp a;
        String b2;
        PowerManager.WakeLock wakeLock;
        try {
            dkty.c("Receiver is started", new Object[0]);
            while (!this.a) {
                try {
                    if (((Boolean) dinr.g.a()).booleanValue() && dizq.o()) {
                        eebh eebhVar = new eebh(this.c);
                        a = eegd.a(eebhVar);
                        if (a != null) {
                            dkty.d(b, "MSRP message: %s", new String(eebhVar.a.array()));
                        }
                    } else {
                        a = eegd.a(this.c);
                    }
                } catch (SocketTimeoutException unused) {
                    dkty.c("Socket read timeout due to inactivity", new Object[0]);
                }
                if (a == null) {
                    throw new EOFException();
                }
                if (this.d != null) {
                    if (djao.o() > 0 && (wakeLock = this.e) != null) {
                        wakeLock.acquire(djao.o());
                    }
                    if (a instanceof eegf) {
                        ?? r6 = this.d;
                        eegf eegfVar = (eegf) a;
                        dkty.d(((eego) r6).f, "New request transaction (id=%s)", eegfVar.d);
                        String a2 = eegfVar.a();
                        if (a2 == null) {
                            dkty.r(((eego) r6).f, "Received a MSRP request with null message ID. Ignoring", new Object[0]);
                        } else {
                            dkty.w(18, 3, "MSRP request received ", new Object[0]);
                            eegc eegcVar = (eegc) ((eego) r6).g.get(eegfVar.a());
                            if (eegcVar == null) {
                                eegcVar = new eegc(eegfVar.c);
                                ((eego) r6).g.put(a2, eegcVar);
                                dkty.d(((eego) r6).f, "Created new msrp message with message ID: %s", eegcVar.b());
                                if (eegfVar.e(fhpi.a) != null) {
                                    enqv it = ((engw) ((eego) r6).d).iterator();
                                    while (it.hasNext()) {
                                        ((eefv) it.next()).aL(eegcVar);
                                    }
                                }
                            }
                            try {
                                try {
                                    try {
                                        eegcVar.l.a(eegfVar.a.e());
                                        int i = eegfVar.b;
                                        String e = eegfVar.e("Failure-Report");
                                        int i2 = i - 1;
                                        if (i2 == 1) {
                                            if (e == null || "yes".equals(e)) {
                                                ((eego) r6).e(eegg.a(eegfVar, BasePaymentResult.ERROR_REQUEST_FAILED, "OK"), eegfVar);
                                            }
                                            int i3 = eegfVar.e;
                                            if (i3 == 36) {
                                                ((eego) r6).g.remove(eegfVar.a());
                                                dkty.c("Timestamp for LAST_CHUNK_RECEIVED: %d", dkvj.a());
                                                dkty.w(17, 3, "complete request received (messageid=%s, data size=%d", eegcVar.b(), Long.valueOf(eegcVar.e));
                                                if (!((Boolean) dizq.c().a.d.a()).booleanValue() || (b2 = eegcVar.b()) == null || ((eego) r6).i.add(b2)) {
                                                    boolean equals = "yes".equals(eegcVar.i);
                                                    if (eegcVar.h != null) {
                                                        byte[] e2 = eegcVar.l.e();
                                                        eegcVar.l.d();
                                                        if (e2 != null) {
                                                            eegcVar.b = eyee.x(e2);
                                                        }
                                                        eegcVar.e = e2 != null ? e2.length : 0L;
                                                        enqv it2 = ((engw) ((eego) r6).d).iterator();
                                                        while (it2.hasNext()) {
                                                            ((eefv) it2.next()).aM(r6, eegcVar);
                                                        }
                                                        if (ecdc.i() && dizi.d()) {
                                                            ecdc.a().e(new ecda("msrpMessageReceived"));
                                                        }
                                                    }
                                                    if (equals) {
                                                        try {
                                                            eegc eegcVar2 = new eegc();
                                                            eegcVar2.r = 3;
                                                            eegcVar2.s = 1;
                                                            eegcVar2.f = eegcVar.e;
                                                            eefm eefmVar = new eefm();
                                                            String a3 = eegcVar.a();
                                                            a3.getClass();
                                                            eefmVar.b("To-Path", a3);
                                                            String d = eegcVar.d();
                                                            d.getClass();
                                                            eefmVar.b("From-Path", d);
                                                            String b3 = eegcVar.b();
                                                            b3.getClass();
                                                            eefmVar.b("Message-ID", b3);
                                                            eegcVar2.g = eefmVar;
                                                            eegcVar2.p = BasePaymentResult.ERROR_REQUEST_FAILED;
                                                            ((eego) r6).c(eegcVar2, false);
                                                        } catch (IOException e3) {
                                                            dkty.j(e3, ((eego) r6).f, "Error while sending success report: %s", e3.getMessage());
                                                        }
                                                    }
                                                } else {
                                                    dkty.l(((eego) r6).f, "Discarding received MSRP message duplicate with ID: %s", b2);
                                                }
                                            } else if (i3 == 35) {
                                                ((eego) r6).g.remove(eegfVar.a());
                                                dkty.d(((eego) r6).f, "Aborted request received. Message ID: %s. Data size: %s", eegcVar.b(), Long.valueOf(eegcVar.e));
                                                eefl eeflVar = eegcVar.l;
                                                if (eeflVar != null) {
                                                    try {
                                                        eeflVar.c();
                                                        eegcVar.l.b();
                                                    } catch (IOException e4) {
                                                        dkty.j(e4, eegc.a, "Error while closing message: %s", e4.getMessage());
                                                    }
                                                }
                                                eegcVar.l.d();
                                                try {
                                                    eegcVar.l.b();
                                                } catch (IOException e5) {
                                                    dkty.j(e5, ((eego) r6).f, "Error while closing chunk cache", new Object[0]);
                                                }
                                                ((eego) r6).d(eegcVar);
                                            } else if (i3 == 43) {
                                                dkty.d(((eego) r6).f, "More chunks are coming - expecting next transaction", new Object[0]);
                                            }
                                        } else if (i2 != 2) {
                                            dkty.h(((eego) r6).f, "receiveMsrpRequest: UNKNOWN method", new Object[0]);
                                            ((eego) r6).e(eegg.a(eegfVar, 501, "MIME-not-understood"), eegfVar);
                                        } else {
                                            dkty.d(((eego) r6).f, "REPORT request received", new Object[0]);
                                            enqv it3 = ((engw) ((eego) r6).d).iterator();
                                            while (it3.hasNext()) {
                                                ((eefv) it3.next()).bk(eegfVar);
                                            }
                                        }
                                    } catch (IOException e6) {
                                        e = e6;
                                        dkty.j(e, ((eego) r6).f, "Error while processing request: %s", e.getMessage());
                                        ((eego) r6).f(eegcVar, 1);
                                    }
                                } finally {
                                    eegfVar.b();
                                }
                            } catch (eefw e7) {
                                e = e7;
                                dkty.j(e, ((eego) r6).f, "Error while processing request: %s", e.getMessage());
                                ((eego) r6).f(eegcVar, 1);
                            }
                        }
                    } else {
                        ?? r62 = this.d;
                        eegg eeggVar = (eegg) a;
                        dkty.d(((eego) r62).f, "New response transaction (id=%s)", eeggVar.d);
                        if (((eego) r62).h.isEmpty()) {
                            dkty.r(((eego) r62).f, "No pending transaction found for response: %s", eeggVar.d);
                        } else {
                            dkty.w(19, 3, "Received MSRP response %d", Integer.valueOf(eeggVar.a));
                            if (eeggVar.d.equals(((eegh) ((eego) r62).h.get()).a())) {
                                ((eegh) ((eego) r62).h.get()).b = eeggVar;
                                int i4 = eeggVar.a;
                                if (i4 == 200) {
                                    dkty.c("Timestamp for MSRP_OK_RESPONSE: %d", dkvj.a());
                                } else if (i4 != 413) {
                                    dkty.d(((eego) r62).f, "Received %d response", Integer.valueOf(i4));
                                } else {
                                    dkty.d(((eego) r62).f, "Received 413 response - stop sending message", new Object[0]);
                                }
                            } else {
                                dkty.r(((eego) r62).f, "Received a response but there is no pending transactions associated with the ID: %s", eeggVar.d);
                            }
                        }
                        eegc eegcVar3 = (eegc) ((eego) r62).h.map(new Function() { // from class: eegm
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                return ((eegh) obj).a;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }).orElse(null);
                        enqv it4 = ((engw) ((eego) r62).d).iterator();
                        while (it4.hasNext()) {
                            ((eefv) it4.next()).aQ(r62, eeggVar, eegcVar3);
                        }
                        ((eego) r62).h.ifPresent(new eegn());
                    }
                }
            }
        } catch (Exception e8) {
            if (this.a) {
                dkty.c("MSRP receiver thread terminated", new Object[0]);
                return;
            }
            dkty.i(e8, "MSRP receiver has failed", new Object[0]);
            this.a = true;
            eegq eegqVar = this.d;
            if (eegqVar != null) {
                String valueOf = String.valueOf(e8.getMessage());
                eefw eefwVar = new eefw(e8);
                if (eefwVar.getCause() == null || eefwVar.getCause().getClass() != EOFException.class) {
                    eego eegoVar = (eego) eegqVar;
                    dkty.h(eegoVar.f, "Generic transfer error:[%s] on message:[%s]", eefwVar.getMessage(), "MSRP receiver has failed : ".concat(valueOf));
                    eegoVar.f(null, 1);
                } else {
                    eego eegoVar2 = (eego) eegqVar;
                    dkty.r(eegoVar2.f, "MSRP socket is closed by the server.", new Object[0]);
                    eegoVar2.f(null, 4);
                }
            }
        }
    }
}
