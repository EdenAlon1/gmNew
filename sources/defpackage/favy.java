package defpackage;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class favy implements favq {
    private final favu a;
    private final Executor b;

    public favy(favu favuVar, Executor executor) {
        this.a = favuVar;
        this.b = executor;
    }

    @Override // defpackage.favq
    public final fawj a(String str, String str2, favs favsVar, favp favpVar) {
        try {
            return new favx(this.a.a(str), str2, favsVar, favpVar, this.b);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("Url is malformed.", e);
        } catch (IOException e2) {
            throw new IllegalStateException("Http connection could not be created.", e2);
        }
    }

    public favy() {
        this(new favv(), null);
    }
}
