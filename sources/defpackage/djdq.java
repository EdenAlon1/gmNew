package defpackage;

import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djdq {
    public static final dktn a = new dktn("ReceiveMessageProducerModule");
    public static final diyy b = dizd.a(189946440);
    public static final diyy c = dizd.a(190862270);

    public static Object a(fbbl fbblVar) {
        try {
            Object a2 = fbblVar.a();
            if (a2 != null) {
                return a2;
            }
            throw new IllegalStateException("No result produced.");
        } catch (ExecutionException e) {
            throw new IllegalStateException(e);
        }
    }
}
