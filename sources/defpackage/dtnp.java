package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtnp extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        boolean z;
        Thread currentThread = Thread.currentThread();
        synchronized (dtnu.a) {
            Boolean bool = (Boolean) dtnu.a.remove(currentThread);
            z = true;
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                if (!booleanValue) {
                }
                return Boolean.valueOf(z);
            }
        }
        int i = dtnq.a;
        if (!"Filter".equals(currentThread.getName())) {
            String name = currentThread.getName();
            if (!Objects.equals(name, "Instr: com.google.android.apps.common.testing.testrunner.Google3InstrumentationTestRunner") && (name == null || !name.startsWith("SimpleServer ConnectionThread "))) {
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }
}
