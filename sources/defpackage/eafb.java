package defpackage;

import android.net.TrafficStats;
import java.net.HttpURLConnection;
import java.net.URL;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eafb implements eafa {
    private final fhmk a;

    public eafb(fhgs fhgsVar) {
        this.a = new fhmk(fhgsVar);
    }

    @Override // defpackage.eafa
    public final HttpURLConnection a(String str) {
        return this.a.c(new URL(str));
    }

    @Override // defpackage.eafa
    public final /* synthetic */ void b() {
        TrafficStats.clearThreadStatsTag();
    }

    @Override // defpackage.eafa
    public final /* synthetic */ void c() {
        TrafficStats.clearThreadStatsUid();
    }

    @Override // defpackage.eafa
    public final /* synthetic */ void d(HttpURLConnection httpURLConnection, int i) {
        TrafficStats.setThreadStatsTag(i);
    }

    @Override // defpackage.eafa
    public final /* synthetic */ void e() {
    }
}
