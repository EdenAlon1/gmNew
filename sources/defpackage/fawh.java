package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fawh implements fawj {
    public String a;
    public fawn b;
    private final favs c;
    private String d;
    private String e;
    private String f;
    private final favp g;
    private final favq h;
    private final long i;
    private double j;
    private int k = 1;
    private long l;
    private final Random m;
    private fawj n;
    private int o;
    private int p;
    private int q;

    public fawh(String str, String str2, favs favsVar, favp favpVar, String str3, favq favqVar, fawp fawpVar, boolean z) {
        if (z) {
            this.a = str;
        } else {
            this.d = str;
            this.e = str2;
            this.f = str3;
        }
        this.c = favsVar == null ? new favs() : favsVar;
        this.h = favqVar;
        this.g = favpVar;
        this.i = fawpVar.a;
        this.j = eobe.a;
        this.l = 1L;
        this.m = new Random();
        this.q = 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final favt h(favs favsVar, String str, favp favpVar) {
        ListenableFuture b;
        i();
        favs favsVar2 = new favs();
        favsVar2.e("X-Goog-Upload-Protocol", "resumable");
        favsVar2.e("X-Goog-Upload-Command", str);
        for (String str2 : favsVar.c()) {
            Iterator it = favsVar.b(str2).iterator();
            while (it.hasNext()) {
                favsVar2.e(str2, (String) it.next());
            }
        }
        if (!favsVar2.f("X-Goog-Hash")) {
            fawr.a();
        }
        fawj a = this.h.a(str.equals(ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_START_TIME) ? this.d : this.a, str.contains(ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_START_TIME) ? this.e : "PUT", favsVar2, favpVar);
        if (this.b != null && !str.equals(ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_START_TIME)) {
            synchronized (this) {
                a.e(new fawg(this, this.b), this.o, this.p);
            }
        }
        synchronized (this) {
            this.n = a;
            b = a.b();
        }
        try {
            fawm fawmVar = (fawm) b.get();
            if (!fawmVar.b()) {
                return fawmVar.b;
            }
            if (fawmVar.a.a != fawk.CANCELED) {
                throw fawmVar.a;
            }
            i();
            throw new fawl(fawk.CONNECTION_ERROR, "");
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException("Unexpected error occurred: ".concat(String.valueOf(e.getMessage())), e);
        }
    }

    private final synchronized void i() {
        int i;
        while (true) {
            i = this.q;
            if (i != 2) {
                break;
            } else {
                try {
                    wait();
                } catch (InterruptedException unused) {
                }
            }
        }
        if (i == 3) {
            throw new fawl(fawk.CANCELED, "");
        }
        emyw.a(i == 1);
    }

    private final void j(fawl fawlVar) {
        if (this.j >= this.i) {
            throw fawlVar;
        }
        double nextDouble = this.m.nextDouble();
        try {
            this.j = this.j + (this.l * nextDouble);
            Thread.sleep((long) (r4 * 1000 * nextDouble));
        } catch (InterruptedException unused) {
        }
        long j = this.l;
        this.l = j + j;
    }

    private final void k() {
        favp favpVar = this.g;
        if (favpVar.d() > favpVar.b()) {
            this.g.g();
            l();
        }
    }

    private final void l() {
        this.l = 1L;
        this.j = eobe.a;
    }

    private final boolean m() {
        try {
            return this.g.i();
        } catch (IOException e) {
            throw new fawl(fawk.REQUEST_BODY_READ_ERROR, "Could not call hasMoreData() on upload stream.", e);
        }
    }

    private static final boolean n(favt favtVar) {
        return favtVar.a / 100 == 4;
    }

    private static final boolean o(favt favtVar) {
        String a;
        favs favsVar = favtVar.b;
        return (favsVar == null || (a = favsVar.a("X-Goog-Upload-Status")) == null || !emuz.e("final", a)) ? false : true;
    }

    private static final boolean p(favt favtVar) {
        String a;
        favs favsVar = favtVar.b;
        return favsVar != null && (a = favsVar.a("X-Goog-Upload-Status")) != null && emuz.e("active", a) && favtVar.a == 200;
    }

    @Override // defpackage.fawj
    public final long a() {
        return this.g.d();
    }

    @Override // defpackage.fawj
    public final ListenableFuture b() {
        errj errjVar = new errj(new Callable() { // from class: fawf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                fawm fawmVar;
                fawh fawhVar = fawh.this;
                try {
                    fawmVar = new fawm(fawhVar.a == null ? fawhVar.g() : fawhVar.c(true));
                } catch (fawl e) {
                    fawmVar = new fawm(e);
                } catch (Throwable th) {
                    fawmVar = new fawm(new fawl(fawk.UNKNOWN, th));
                }
                synchronized (fawhVar) {
                }
                return fawmVar;
            }
        });
        ersf ersfVar = new ersf();
        ersfVar.d("Scotty-Uploader-ResumableTransfer-%d");
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(ersf.b(ersfVar));
        newSingleThreadExecutor.submit(errjVar);
        newSingleThreadExecutor.shutdown();
        return errjVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x00d6, code lost:
    
        if (r8.a() != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x00d8, code lost:
    
        j(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01e6, code lost:
    
        throw r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0075, code lost:
    
        r1 = "upload";
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0078, code lost:
    
        r1 = "finalize";
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x001f, code lost:
    
        if (r7.g.c() != Long.MAX_VALUE) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0021, code lost:
    
        r8 = r7.g;
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x00f6, code lost:
    
        if (p(r0) == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0028, code lost:
    
        r8 = new defpackage.favo(r7.g, r7.k);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0031, code lost:
    
        r1 = r8.e();
        r3 = r7.g.c();
        r5 = r7.k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0042, code lost:
    
        if (r1 < ((r3 / r5) * r5)) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0057, code lost:
    
        if ((r7.g.d() + r8.e()) != r7.g.e()) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x005a, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0060, code lost:
    
        r8 = r7.g;
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01e7, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01f1, code lost:
    
        throw new defpackage.fawl(defpackage.fawk.REQUEST_BODY_READ_ERROR, "Could not create chunked data stream.", r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x01c2, code lost:
    
        if (n(r0) == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x01c9, code lost:
    
        j(new defpackage.fawl(defpackage.fawk.SERVER_ERROR, r0.a()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x01c4, code lost:
    
        if (r0 != null) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x01c8, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1:0x0000, code lost:
    
        if (r8 != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00f8, code lost:
    
        r8 = r0.b.a("X-Goog-Upload-Chunk-Granularity");
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0100, code lost:
    
        if (r8 == null) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0114, code lost:
    
        r0 = java.lang.Long.parseLong(r0.b.a("X-Goog-Upload-Size-Received"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0128, code lost:
    
        if (r0 < r7.g.b()) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0132, code lost:
    
        if (r0 < r7.g.d()) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0135, code lost:
    
        r7.g.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x00db, code lost:
    
        r8 = r7.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0142, code lost:
    
        if (r7.g.d() >= r0) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0148, code lost:
    
        if (m() == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x014a, code lost:
    
        r8 = r7.g;
        r8.f(r0 - r8.d());
        r7.g.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x015b, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0165, code lost:
    
        throw new defpackage.fawl(defpackage.fawk.REQUEST_BODY_READ_ERROR, "Could not skip in the data stream.", r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0166, code lost:
    
        r8 = r7.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0189, code lost:
    
        throw new defpackage.fawl(defpackage.fawk.REQUEST_BODY_READ_ERROR, "Upload stream does not have more data but it should. Maybe the caller passed in a data stream to upload with a mark position that didn't match the transfer handle? Confirmed offset from server: " + r0 + " Size: " + r8.d());
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x018a, code lost:
    
        k();
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x018f, code lost:
    
        r8 = r7.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01b2, code lost:
    
        throw new defpackage.fawl(defpackage.fawk.SERVER_ERROR, "The server lost bytes that were previously committed. Our offset: " + r8.b() + ", server offset: " + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x00dd, code lost:
    
        r0 = h(r8, com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion.SUGGESTION_PROPERTY_MAP_QUERY, new defpackage.fawi(""));
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01b3, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01bd, code lost:
    
        throw new defpackage.fawl(defpackage.fawk.SERVER_ERROR, "Failed to parse X-Goog-Upload-Size-Received header", r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0102, code lost:
    
        r7.k = java.lang.Integer.parseInt(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0109, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0113, code lost:
    
        throw new defpackage.fawl(defpackage.fawk.SERVER_ERROR, "Server returned an invalid chunk granularity.", r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01d9, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01de, code lost:
    
        if (r0.a() != false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01e0, code lost:
    
        j(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01e5, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0009, code lost:
    
        if (m() != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x000b, code lost:
    
        r8 = r7.g;
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0066, code lost:
    
        r0 = r0.booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x006e, code lost:
    
        if (m() == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0070, code lost:
    
        if (r0 == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0072, code lost:
    
        r1 = "upload, finalize";
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x007a, code lost:
    
        r2 = r7.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x007c, code lost:
    
        if (r2 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x007e, code lost:
    
        r2.b(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0081, code lost:
    
        r2 = r7.c;
        r2.e("X-Goog-Upload-Offset", java.lang.Long.toString(r7.g.d()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0092, code lost:
    
        r8 = h(r2, r1, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x009a, code lost:
    
        if (o(r8) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00a1, code lost:
    
        if (p(r8) == false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00a3, code lost:
    
        if (r0 != false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00a5, code lost:
    
        k();
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00b3, code lost:
    
        throw new defpackage.fawl(defpackage.fawk.SERVER_ERROR, "Finalize call returned active state.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00ee, code lost:
    
        if (o(r0) == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x00b8, code lost:
    
        if (n(r8) == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00be, code lost:
    
        if (r8.a != 400) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x00c1, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x00c2, code lost:
    
        j(new defpackage.fawl(defpackage.fawk.SERVER_ERROR, r8.a()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x00d1, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:97:0x01c4 -> B:2:0x0004). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.favt c(boolean r8) {
        /*
            Method dump skipped, instructions count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fawh.c(boolean):favt");
    }

    @Override // defpackage.fawj
    public final String d() {
        return this.a;
    }

    @Override // defpackage.fawj
    public final synchronized void e(fawn fawnVar, int i, int i2) {
        boolean z = true;
        emxf.b(i > 0, "Progress threshold (bytes) must be greater than 0");
        if (i2 < 0) {
            z = false;
        }
        emxf.b(z, "Progress threshold (millis) must be greater or equal to 0");
        this.b = fawnVar;
        this.o = i;
        this.p = i2;
    }

    @Override // defpackage.fawj
    public final void f() {
        synchronized (this) {
            fawj fawjVar = this.n;
            if (fawjVar != null) {
                fawjVar.f();
                this.n = null;
            }
            this.q = 3;
            notifyAll();
        }
    }

    public final favt g() {
        favt h;
        synchronized (this) {
        }
        l();
        while (true) {
            try {
                h = h(this.c, ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_START_TIME, new fawi(emxe.b(this.f)));
            } catch (fawl e) {
                if (!e.a()) {
                    throw e;
                }
                j(e);
            }
            if (!o(h)) {
                if (!p(h)) {
                    if (n(h)) {
                        break;
                    }
                    j(new fawl(fawk.SERVER_ERROR, h.a()));
                } else {
                    favs favsVar = h.b;
                    String a = favsVar.a("X-Goog-Upload-URL");
                    try {
                        new URL(a);
                        this.a = a;
                        synchronized (this) {
                            fawn fawnVar = this.b;
                            if (fawnVar != null) {
                                fawnVar.a(this);
                            }
                        }
                        String a2 = favsVar.a("X-Goog-Upload-Chunk-Granularity");
                        if (a2 != null) {
                            try {
                                this.k = Integer.parseInt(a2);
                            } catch (NumberFormatException e2) {
                                throw new fawl(fawk.SERVER_ERROR, "Server returned an invalid chunk granularity.", e2);
                            }
                        }
                        return c(false);
                    } catch (MalformedURLException e3) {
                        throw new fawl(fawk.SERVER_ERROR, "Server returned an invalid upload url.", e3);
                    }
                }
            } else {
                break;
            }
        }
        return h;
    }
}
