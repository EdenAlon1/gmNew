package defpackage;

import android.net.TrafficStats;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eaeg implements eafa {
    private final eaef a;

    public eaeg(eaef eaefVar) {
        this.a = eaefVar;
    }

    @Override // defpackage.eafa
    public final HttpURLConnection a(String str) {
        URLConnection openConnection = this.a.a.openConnection(new URL(str));
        if (openConnection instanceof HttpURLConnection) {
            return (HttpURLConnection) openConnection;
        }
        throw new IOException("Cronet connection is not an HttpURLConnection");
    }

    @Override // defpackage.eafa
    public final void d(HttpURLConnection httpURLConnection, int i) {
        if (httpURLConnection instanceof fimi) {
            ((fimi) httpURLConnection).b(i);
        } else {
            TrafficStats.setThreadStatsTag(i);
        }
    }

    @Override // defpackage.eafa
    public final void b() {
    }

    @Override // defpackage.eafa
    public final void c() {
    }

    @Override // defpackage.eafa
    public final /* synthetic */ void e() {
    }
}
