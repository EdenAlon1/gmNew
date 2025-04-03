package defpackage;

import java.util.Random;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ensu extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    protected final /* synthetic */ Object initialValue() {
        return new Random();
    }
}
