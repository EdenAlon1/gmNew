package defpackage;

import java.util.Random;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fflu extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    public final /* synthetic */ Object initialValue() {
        return new Random();
    }
}
