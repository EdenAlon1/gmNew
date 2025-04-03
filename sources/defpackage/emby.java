package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.util.Objects;
import java.io.ObjectInputStream;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class emby extends embk {
    static final Duration c = Duration.ofMinutes(3);
    static final Duration d = Duration.ofMinutes(3).plusSeconds(45);
    public static final enhk e = enoz.a;
    private static final long serialVersionUID = 4556936364828217687L;
    private final Duration a;
    private final Duration b;
    final Object f;
    public volatile embu g;
    transient embw h;

    protected emby() {
        this(null, d, c);
    }

    private final int b() {
        embu embuVar = this.g;
        if (embuVar == null) {
            return 3;
        }
        Long l = embuVar.a.b;
        Date date = l == null ? null : new Date(l.longValue());
        if (date == null) {
            return 1;
        }
        long time = date.getTime() - System.currentTimeMillis();
        Duration duration = this.a;
        Duration ofMillis = Duration.ofMillis(time);
        if (ofMillis.compareTo(duration) <= 0) {
            return 3;
        }
        return ofMillis.compareTo(this.b) <= 0 ? 2 : 1;
    }

    public static emby d(embm embmVar) {
        embs embsVar = new embs();
        embsVar.a = embmVar;
        return new emby(embsVar.a, embsVar.b, embsVar.c);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.h = null;
    }

    @Override // defpackage.embk
    public void a(Executor executor, feeb feebVar) {
        embr embrVar;
        ListenableFuture i;
        ListenableFuture listenableFuture;
        if (b() == 1) {
            listenableFuture = erqt.i(this.g);
        } else {
            synchronized (this.f) {
                if (b() != 1) {
                    synchronized (this.f) {
                        embw embwVar = this.h;
                        if (embwVar != null) {
                            embrVar = new embr(embwVar, false);
                        } else {
                            errj errjVar = new errj(new embq(this));
                            this.h = new embw(errjVar, new embx(this, errjVar));
                            embrVar = new embr(this.h, true);
                        }
                    }
                } else {
                    embrVar = null;
                }
            }
            if (embrVar != null && embrVar.b) {
                executor.execute(embrVar.a);
            }
            synchronized (this.f) {
                i = b() != 3 ? erqt.i(this.g) : embrVar != null ? embrVar.a : erqt.h(new IllegalStateException("Credentials expired, but there is no task to refresh"));
            }
            listenableFuture = i;
        }
        erqt.r(listenableFuture, new embt(feebVar), erpp.a);
    }

    public embm c() {
        throw new IllegalStateException("OAuth2Credentials instance does not support refreshing the access token. An instance with a new access token should be used, or a derived type that supports refreshing.");
    }

    public boolean equals(Object obj) {
        if (obj instanceof emby) {
            return Objects.equals(this.g, ((emby) obj).g);
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(this.g);
    }

    public String toString() {
        Map map;
        embm embmVar;
        embu embuVar = this.g;
        if (embuVar != null) {
            map = embuVar.b;
            embmVar = embuVar.a;
        } else {
            map = null;
            embmVar = null;
        }
        emwz b = emxa.b(this);
        b.b("requestMetadata", map);
        b.b("temporaryAccess", embmVar);
        return b.toString();
    }

    protected emby(embm embmVar, Duration duration, Duration duration2) {
        this.f = new byte[0];
        this.g = null;
        if (embmVar != null) {
            this.g = embu.a(embmVar, e);
        }
        duration.getClass();
        this.b = duration;
        emxf.b(!duration.isNegative(), "refreshMargin can't be negative");
        duration2.getClass();
        this.a = duration2;
        emxf.b(!duration2.isNegative(), "expirationMargin can't be negative");
    }
}
