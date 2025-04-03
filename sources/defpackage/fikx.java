package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.TrafficStats;
import android.os.Trace;
import android.util.Log;
import androidx.car.app.navigation.model.Maneuver;
import com.android.vcard.VCardBuilder;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.net.CronetException;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.InlineExecutionProhibitedException;
import org.chromium.net.ThreadStatsUid;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;
import org.chromium.net.impl.VersionSafeCallbacks$UrlRequestStatusListener;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fikx extends ExperimentalUrlRequest {
    public static final String a = "fikx";
    public final fikt b;
    public final Executor c;
    public final String d;
    public final boolean h;
    public final String i;
    public filt j;
    public Executor k;
    public String m;
    public ReadableByteChannel n;
    public film o;
    public String p;
    public HttpURLConnection q;
    public fiku r;
    public final fijg s;
    public final int t;
    public final fiic u;
    public final long v;
    public int w;
    public int x;
    public boolean y;
    public final Map e = new TreeMap(String.CASE_INSENSITIVE_ORDER);
    public final List f = new ArrayList();
    public final AtomicInteger g = new AtomicInteger(0);
    private final AtomicBoolean z = new AtomicBoolean(false);
    public volatile int l = -1;

    public fikx(fijg fijgVar, UrlRequest.Callback callback, final Executor executor, Executor executor2, String str, String str2, boolean z, boolean z2, int i, final boolean z3, final int i2, long j, String str3, ArrayList arrayList, UploadDataProvider uploadDataProvider, Executor executor3) {
        filt filtVar;
        new fiev("Cronet JavaUrlRequest#JavaUrlRequest");
        try {
            this.h = z;
            this.b = new fikt(this, callback, executor2);
            final int threadStatsTag = !z2 ? TrafficStats.getThreadStatsTag() : i;
            this.c = new fikw(new Executor() { // from class: fijv
                @Override // java.util.concurrent.Executor
                public final void execute(final Runnable runnable) {
                    String str4 = fikx.a;
                    final int i3 = threadStatsTag;
                    final boolean z4 = z3;
                    final int i4 = i2;
                    executor.execute(new Runnable() { // from class: fijx
                        @Override // java.lang.Runnable
                        public final void run() {
                            String str5 = fikx.a;
                            int threadStatsTag2 = TrafficStats.getThreadStatsTag();
                            TrafficStats.setThreadStatsTag(i3);
                            Runnable runnable2 = runnable;
                            boolean z5 = z4;
                            if (z5) {
                                ThreadStatsUid.set(i4);
                            }
                            try {
                                runnable2.run();
                                if (z5) {
                                    ThreadStatsUid.clear();
                                }
                                TrafficStats.setThreadStatsTag(threadStatsTag2);
                            } catch (Throwable th) {
                                if (z5) {
                                    ThreadStatsUid.clear();
                                }
                                TrafficStats.setThreadStatsTag(threadStatsTag2);
                                throw th;
                            }
                        }
                    });
                }
            });
            this.s = fijgVar;
            this.t = fijgVar.a;
            this.u = fijgVar.b;
            this.m = str;
            this.d = str2;
            this.v = j;
            if (!"OPTIONS".equalsIgnoreCase(str3) && !"GET".equalsIgnoreCase(str3) && !"HEAD".equalsIgnoreCase(str3) && !"POST".equalsIgnoreCase(str3) && !"PUT".equalsIgnoreCase(str3) && !"DELETE".equalsIgnoreCase(str3) && !"TRACE".equalsIgnoreCase(str3) && !"PATCH".equalsIgnoreCase(str3)) {
                throw new IllegalArgumentException("Invalid http method ".concat(str3));
            }
            this.i = str3;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                Map.Entry entry = (Map.Entry) arrayList.get(i3);
                String str4 = (String) entry.getKey();
                int i4 = 0;
                while (true) {
                    if (i4 < str4.length()) {
                        char charAt = str4.charAt(i4);
                        if (charAt != ',' && charAt != '/' && charAt != '{' && charAt != '}') {
                            switch (charAt) {
                                case Maneuver.TYPE_DESTINATION /* 39 */:
                                case '(':
                                case ')':
                                    break;
                                default:
                                    switch (charAt) {
                                        case ':':
                                        case ';':
                                        case '<':
                                        case '=':
                                        case '>':
                                        case '?':
                                        case '@':
                                            break;
                                        default:
                                            switch (charAt) {
                                                case '[':
                                                case '\\':
                                                case ']':
                                                    break;
                                                default:
                                                    i4 = (Character.isISOControl(charAt) || Character.isWhitespace(charAt)) ? i4 : i4 + 1;
                                                    break;
                                            }
                                    }
                            }
                        }
                    } else if (!((String) entry.getValue()).contains(VCardBuilder.VCARD_END_OF_LINE)) {
                        this.e.put((String) entry.getKey(), (String) entry.getValue());
                    }
                }
                throw new IllegalArgumentException("Invalid header with headername: ".concat(String.valueOf((String) entry.getKey())));
            }
            if (uploadDataProvider == null) {
                filtVar = null;
            } else {
                if (!this.e.containsKey(fhpi.a)) {
                    throw new IllegalArgumentException("Requests with upload data must have a Content-Type.");
                }
                filtVar = new filt(uploadDataProvider);
            }
            this.j = filtVar;
            this.k = (executor3 == null || this.h) ? executor3 : new fila(executor3);
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public final void a() {
        d(new Runnable() { // from class: fikc
            @Override // java.lang.Runnable
            public final void run() {
                fikx fikxVar = fikx.this;
                ReadableByteChannel readableByteChannel = fikxVar.n;
                if (readableByteChannel != null) {
                    try {
                        readableByteChannel.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    fikxVar.n = null;
                }
            }
        }, "closeResponseChannel");
    }

    public final void b(final CronetException cronetException) {
        int i;
        do {
            i = this.g.get();
            if (i == 0) {
                throw new IllegalStateException("Can't enter error state before start");
            }
            if (i == 6 || i == 7 || i == 8) {
                return;
            }
        } while (!this.g.compareAndSet(i, 6));
        f();
        e();
        final fikt fiktVar = this.b;
        final film filmVar = this.o;
        fiktVar.d.a();
        final Runnable runnable = new Runnable() { // from class: fikl
            @Override // java.lang.Runnable
            public final void run() {
                UrlResponseInfo urlResponseInfo = filmVar;
                fikt fiktVar2 = fikt.this;
                try {
                    fiktVar2.a.onFailed(fiktVar2.d, urlResponseInfo, cronetException);
                } catch (Exception e) {
                    fiktVar2.d.i("onFailed", e);
                }
                fiktVar2.c();
                fiktVar2.d.s.c();
            }
        };
        try {
            fiktVar.b(runnable, "onFailed");
        } catch (InlineExecutionProhibitedException unused) {
            if (fiktVar.c != null) {
                new fiev("Cronet JavaUrlRequest.AsyncUrlRequestCallback#executeOnFallbackExecutor onFailed");
                try {
                    fiktVar.c.execute(new Runnable() { // from class: fikk
                        public final /* synthetic */ String a = "onFailed";

                        @Override // java.lang.Runnable
                        public final void run() {
                            new fiev("Cronet JavaUrlRequest.AsyncUrlRequestCallback#executeOnFallbackExecutor  " + this.a + " running callback");
                            try {
                                runnable.run();
                                Trace.endSection();
                            } catch (Throwable th) {
                                try {
                                    Trace.endSection();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        }
                    });
                    Trace.endSection();
                } catch (Throwable th) {
                    try {
                        Trace.endSection();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }
    }

    public final void c(Throwable th) {
        b(new fihc("Exception received from UploadDataProvider", th));
    }

    @Override // org.chromium.net.UrlRequest
    public final void cancel() {
        int andSet = this.g.getAndSet(8);
        if (andSet == 1 || andSet == 2 || andSet == 3 || andSet == 4 || andSet == 5) {
            f();
            e();
            final fikt fiktVar = this.b;
            final film filmVar = this.o;
            fiktVar.d.a();
            fiktVar.b(new Runnable() { // from class: fikq
                @Override // java.lang.Runnable
                public final void run() {
                    fikt fiktVar2 = fikt.this;
                    try {
                        fiktVar2.a.onCanceled(fiktVar2.d, filmVar);
                    } catch (Exception e) {
                        fiktVar2.d.i("onCanceled", e);
                    }
                    fiktVar2.c();
                    fiktVar2.d.s.c();
                }
            }, "onCanceled");
        }
    }

    public final void d(final Runnable runnable, final String str) {
        new fiev("Cronet JavaUrlRequest#executeOnExecutor ".concat(str));
        try {
            this.c.execute(new Runnable() { // from class: fikf
                @Override // java.lang.Runnable
                public final void run() {
                    String str2 = fikx.a;
                    new fiev("Cronet JavaUrlRequest#executeOnExecutor " + str + " running callback");
                    try {
                        runnable.run();
                        Trace.endSection();
                    } catch (Throwable th) {
                        try {
                            Trace.endSection();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            });
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void e() {
        if (this.j == null || !this.z.compareAndSet(false, true)) {
            return;
        }
        try {
            Executor executor = this.k;
            final filt filtVar = this.j;
            filtVar.getClass();
            executor.execute(new fijy(this, new fiky() { // from class: fijs
                @Override // defpackage.fiky
                public final void a() {
                    String str = fikx.a;
                    filt.this.close();
                }
            }));
        } catch (RejectedExecutionException e) {
            Log.e(a, "Exception when closing uploadDataProvider", e);
        }
    }

    public final void f() {
        d(new Runnable() { // from class: fijt
            @Override // java.lang.Runnable
            public final void run() {
                fikx fikxVar = fikx.this;
                fiku fikuVar = fikxVar.r;
                if (fikuVar != null) {
                    try {
                        fikuVar.j();
                    } catch (IOException e) {
                        Log.e(fikx.a, "Exception when closing OutputChannel", e);
                    }
                }
                HttpURLConnection httpURLConnection = fikxVar.q;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                    fikxVar.q = null;
                }
            }
        }, "fireDisconnect");
    }

    @Override // org.chromium.net.UrlRequest
    public final void followRedirect() {
        j(3, 1, new fiki(this));
    }

    public final void g() {
        this.l = 13;
        d(new fiju(this, new fiky() { // from class: fika
            @Override // defpackage.fiky
            public final void a() {
                List<String> list;
                final fikx fikxVar = fikx.this;
                if (fikxVar.q == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                String str = "http/1.1";
                int i = 0;
                while (true) {
                    String headerFieldKey = fikxVar.q.getHeaderFieldKey(i);
                    if (headerFieldKey == null) {
                        break;
                    }
                    if ("X-Android-Selected-Transport".equalsIgnoreCase(headerFieldKey)) {
                        str = fikxVar.q.getHeaderField(i);
                    }
                    if (!headerFieldKey.startsWith("X-Android")) {
                        arrayList.add(new AbstractMap.SimpleEntry(headerFieldKey, fikxVar.q.getHeaderField(i)));
                    }
                    i++;
                }
                int responseCode = fikxVar.q.getResponseCode();
                final film filmVar = new film(new ArrayList(fikxVar.f), responseCode, fikxVar.q.getResponseMessage(), DesugarCollections.unmodifiableList(arrayList), false, str, "", 0L);
                if (responseCode >= 300 && responseCode < 400 && (list = filmVar.getAllHeaders().get("location")) != null) {
                    final String str2 = list.get(0);
                    fikxVar.j(1, 2, new Runnable() { // from class: fike
                        @Override // java.lang.Runnable
                        public final void run() {
                            final fikx fikxVar2 = fikx.this;
                            fikxVar2.p = URI.create(fikxVar2.m).resolve(str2).toString();
                            fikxVar2.f.add(fikxVar2.p);
                            final UrlResponseInfo urlResponseInfo = filmVar;
                            fikxVar2.j(2, 3, new Runnable() { // from class: fijr
                                @Override // java.lang.Runnable
                                public final void run() {
                                    fikx fikxVar3 = fikx.this;
                                    final String str3 = fikxVar3.p;
                                    final fikt fiktVar = fikxVar3.b;
                                    final UrlResponseInfo urlResponseInfo2 = urlResponseInfo;
                                    fiktVar.a(new fiky() { // from class: fiks
                                        @Override // defpackage.fiky
                                        public final void a() {
                                            fikt fiktVar2 = fikt.this;
                                            fiktVar2.a.onRedirectReceived(fiktVar2.d, urlResponseInfo2, str3);
                                        }
                                    }, "onRedirectReceived");
                                }
                            });
                        }
                    });
                    return;
                }
                fikxVar.o = filmVar;
                fikxVar.e();
                if (responseCode < 400) {
                    fikxVar.n = fijc.a(fikxVar.q.getInputStream());
                    fikxVar.b.d();
                } else {
                    InputStream errorStream = fikxVar.q.getErrorStream();
                    fikxVar.n = errorStream == null ? null : fijc.a(errorStream);
                    fikxVar.b.d();
                }
            }
        }), "fireGetHeaders");
    }

    @Override // org.chromium.net.UrlRequest
    public final void getStatus(UrlRequest.StatusListener statusListener) {
        int i = this.g.get();
        final int i2 = this.l;
        switch (i) {
            case 0:
            case 6:
            case 7:
            case 8:
                i2 = -1;
                break;
            case 1:
                break;
            case 2:
            case 3:
            case 4:
                i2 = 0;
                break;
            case 5:
                i2 = 14;
                break;
            default:
                throw new IllegalStateException(a.h(i, "Switch is exhaustive: "));
        }
        fikt fiktVar = this.b;
        final VersionSafeCallbacks$UrlRequestStatusListener versionSafeCallbacks$UrlRequestStatusListener = new VersionSafeCallbacks$UrlRequestStatusListener(statusListener);
        fiktVar.b(new Runnable() { // from class: fiko
            @Override // java.lang.Runnable
            public final void run() {
                VersionSafeCallbacks$UrlRequestStatusListener.this.onStatus(i2);
            }
        }, "sendStatus");
    }

    public final void h() {
        d(new fiju(this, new fiky() { // from class: fijz
            @Override // defpackage.fiky
            public final void a() {
                fikx fikxVar = fikx.this;
                if (fikxVar.g.get() == 8) {
                    return;
                }
                URL url = new URL(fikxVar.m);
                HttpURLConnection httpURLConnection = fikxVar.q;
                Network network = null;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                    fikxVar.q = null;
                }
                long j = fikxVar.v;
                if (j == -1) {
                    fikxVar.q = (HttpURLConnection) url.openConnection();
                } else {
                    Network[] allNetworks = ((ConnectivityManager) fikxVar.s.d.getSystemService("connectivity")).getAllNetworks();
                    int length = allNetworks.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            break;
                        }
                        Network network2 = allNetworks[i];
                        if (network2.getNetworkHandle() == j) {
                            network = network2;
                            break;
                        }
                        i++;
                    }
                    if (network == null) {
                        throw new file("Network bound to request not found", 9, -4);
                    }
                    fikxVar.q = (HttpURLConnection) network.openConnection(url);
                }
                fikxVar.q.setInstanceFollowRedirects(false);
                if (!fikxVar.e.containsKey("User-Agent")) {
                    fikxVar.e.put("User-Agent", fikxVar.d);
                }
                for (Map.Entry entry : fikxVar.e.entrySet()) {
                    fikxVar.q.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                fikxVar.q.setRequestMethod(fikxVar.i);
                filt filtVar = fikxVar.j;
                if (filtVar == null) {
                    fikxVar.l = 10;
                    fikxVar.q.connect();
                    fikxVar.g();
                } else {
                    fikxVar.r = new fiku(fikxVar, fikxVar.k, fikxVar.c, fikxVar.q, filtVar);
                    final fiku fikuVar = fikxVar.r;
                    final boolean z = fikxVar.f.size() == 1;
                    fikuVar.d(new fiky() { // from class: fijj
                        @Override // defpackage.fiky
                        public final void a() {
                            fijq fijqVar = fijq.this;
                            long length2 = fijqVar.c.getLength();
                            fijqVar.e = length2;
                            if (length2 == 0) {
                                fijqVar.e();
                                return;
                            }
                            if (length2 <= 0 || length2 >= 8192) {
                                fijqVar.d = ByteBuffer.allocateDirect(8192);
                            } else {
                                fijqVar.d = ByteBuffer.allocateDirect(((int) length2) + 1);
                            }
                            long j2 = fijqVar.e;
                            if (j2 > 0) {
                                ((fiku) fijqVar).h.setFixedLengthStreamingMode(j2);
                            } else {
                                ((fiku) fijqVar).h.setChunkedStreamingMode(8192);
                            }
                            if (z) {
                                fijqVar.i();
                            } else {
                                fijqVar.a.set(1);
                                fijqVar.c.rewind(fijqVar);
                            }
                        }
                    }, ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_START_TIME);
                }
            }
        }), "fireOpenConnection");
    }

    public final void i(String str, Exception exc) {
        Log.e(a, a.a(str, "Exception in ", " method"), exc);
        this.y = true;
    }

    @Override // org.chromium.net.UrlRequest
    public final boolean isDone() {
        int i = this.g.get();
        return i == 7 || i == 6 || i == 8;
    }

    public final void j(int i, int i2, Runnable runnable) {
        if (!this.g.compareAndSet(i, i2)) {
            int i3 = this.g.get();
            if (i3 == 8 || i3 == 6) {
                return;
            }
            throw new IllegalStateException("Invalid state transition - expected " + filb.a(i) + " but was " + filb.a(i3));
        }
        new fiev("Cronet JavaUrlRequest#transitionStates " + filb.a(i) + " -> " + filb.a(i2));
        try {
            runnable.run();
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // org.chromium.net.UrlRequest
    public final void read(final ByteBuffer byteBuffer) {
        filg.a(byteBuffer);
        filg.b(byteBuffer);
        final fiky fikyVar = new fiky() { // from class: fikg
            @Override // defpackage.fiky
            public final void a() {
                int i;
                fikx fikxVar = fikx.this;
                ReadableByteChannel readableByteChannel = fikxVar.n;
                final ByteBuffer byteBuffer2 = byteBuffer;
                if (readableByteChannel != null) {
                    fikxVar.w++;
                    i = readableByteChannel.read(byteBuffer2);
                } else {
                    i = -1;
                }
                if (i != -1) {
                    final fikt fiktVar = fikxVar.b;
                    final film filmVar = fikxVar.o;
                    fiktVar.a(new fiky() { // from class: fikm
                        @Override // defpackage.fiky
                        public final void a() {
                            fikt fiktVar2 = fikt.this;
                            if (fiktVar2.d.g.compareAndSet(5, 4)) {
                                ByteBuffer byteBuffer3 = byteBuffer2;
                                fiktVar2.a.onReadCompleted(fiktVar2.d, filmVar, byteBuffer3);
                            }
                        }
                    }, "onReadCompleted");
                    return;
                }
                ReadableByteChannel readableByteChannel2 = fikxVar.n;
                if (readableByteChannel2 != null) {
                    readableByteChannel2.close();
                }
                if (fikxVar.g.compareAndSet(5, 7)) {
                    fikxVar.f();
                    final fikt fiktVar2 = fikxVar.b;
                    final film filmVar2 = fikxVar.o;
                    fiktVar2.b(new Runnable() { // from class: fikj
                        @Override // java.lang.Runnable
                        public final void run() {
                            fikt fiktVar3 = fikt.this;
                            try {
                                fiktVar3.a.onSucceeded(fiktVar3.d, filmVar2);
                            } catch (Exception e) {
                                fiktVar3.d.i("onSucceded", e);
                            }
                            fiktVar3.c();
                            fiktVar3.d.s.c();
                        }
                    }, "onSucceeded");
                }
            }
        };
        j(4, 5, new Runnable() { // from class: fikh
            @Override // java.lang.Runnable
            public final void run() {
                fikx fikxVar = fikx.this;
                fikxVar.d(new fiju(fikxVar, fikyVar), "read");
            }
        });
    }

    @Override // org.chromium.net.UrlRequest
    public final void start() {
        this.l = 10;
        this.s.c.incrementAndGet();
        j(0, 1, new Runnable() { // from class: fijw
            @Override // java.lang.Runnable
            public final void run() {
                fikx fikxVar = fikx.this;
                fikxVar.f.add(fikxVar.m);
                fikxVar.h();
            }
        });
    }
}
