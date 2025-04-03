package j$.nio.file;

import java.nio.file.WatchEvent;

/* loaded from: classes9.dex */
public final /* synthetic */ class E implements G {
    public final /* synthetic */ WatchEvent.Kind a;

    private /* synthetic */ E(WatchEvent.Kind kind) {
        this.a = kind;
    }

    public static /* synthetic */ G a(WatchEvent.Kind kind) {
        if (kind == null) {
            return null;
        }
        return kind instanceof F ? ((F) kind).a : new E(kind);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        WatchEvent.Kind kind = this.a;
        if (obj instanceof E) {
            obj = ((E) obj).a;
        }
        return kind.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.nio.file.G
    public final /* synthetic */ String name() {
        String name;
        name = this.a.name();
        return name;
    }

    @Override // j$.nio.file.G
    public final /* synthetic */ Class type() {
        Class type;
        type = this.a.type();
        return type;
    }
}
