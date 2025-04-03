package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementResponse;
import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evez {
    public static fdxp a(final ffbr ffbrVar) {
        return new evey(new ffbr() { // from class: evex
            @Override // defpackage.ffbr, defpackage.ffbq
            public final Object b() {
                return engw.r((engw) ffbr.this.b());
            }
        }, eyhs.class, eyhs.class);
    }

    public static void b(febs febsVar, Class cls, boolean z) {
        Class<?> cls2;
        boolean z2;
        try {
            cls2 = ((ffae) (z ? febsVar.d : febsVar.e)).a.getClass();
            z2 = false;
        } catch (ClassCastException unused) {
            cls2 = Object.class;
            z2 = true;
        }
        if (cls.isAssignableFrom(cls2)) {
            return;
        }
        String str = true != z ? GroupManagementResponse.XML_TAG : GroupManagementRequest.XML_TAG;
        String str2 = febsVar.b;
        throw Status.o.withDescription("AsyncClientInterceptor: The " + str + " message type of method " + str2 + " (" + cls2.getName() + (true != z2 ? "" : ", assumed because method doesn't use ReflectableMarshaller") + ") must be a subclass of " + cls.toString()).asException();
    }
}
