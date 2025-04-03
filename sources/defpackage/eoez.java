package defpackage;

import j$.util.Objects;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class eoez {
    public abstract eoey a(String str);

    public final Optional b(CharSequence charSequence) {
        return Optional.ofNullable(Objects.toString(a(charSequence.toString()), null));
    }
}
