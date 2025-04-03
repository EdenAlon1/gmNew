package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eyfp implements eyhq {
    public static final eyfp a = new eyfp();

    private eyfp() {
    }

    @Override // defpackage.eyhq
    public final eyhp a(Class cls) {
        if (!eyfy.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(String.valueOf(cls.getName())));
        }
        try {
            return (eyhp) eyfy.getDefaultInstance(cls.asSubclass(eyfy.class)).buildMessageInfo();
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for ".concat(String.valueOf(cls.getName())), e);
        }
    }

    @Override // defpackage.eyhq
    public final boolean b(Class cls) {
        return eyfy.class.isAssignableFrom(cls);
    }
}
