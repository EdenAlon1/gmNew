package j$.nio.file;

import java.nio.file.WatchEvent;

/* loaded from: classes9.dex */
public final /* synthetic */ class H {
    public final /* synthetic */ WatchEvent.Modifier a;

    private /* synthetic */ H(WatchEvent.Modifier modifier) {
        this.a = modifier;
    }

    public static /* synthetic */ H a(WatchEvent.Modifier modifier) {
        if (modifier == null) {
            return null;
        }
        return new H(modifier);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        WatchEvent.Modifier modifier = this.a;
        if (obj instanceof H) {
            obj = ((H) obj).a;
        }
        return modifier.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
