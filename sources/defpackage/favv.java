package defpackage;

import java.net.HttpURLConnection;
import java.net.URL;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class favv implements favu {
    @Override // defpackage.favu
    public final HttpURLConnection a(String str) {
        return (HttpURLConnection) new URL(str).openConnection();
    }
}
