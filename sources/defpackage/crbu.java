package defpackage;

import android.net.Uri;
import com.google.android.rcs.client.messaging.data.ContentType;
import j$.time.Duration;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
public abstract class crbu {
    public abstract crbv a();

    public abstract Optional b();

    public abstract void c(Duration duration);

    public abstract void d(ContentType contentType);

    public abstract void e(Uri uri);

    public abstract void f(String str);

    public abstract void g(long j);

    public abstract void h(ContentType contentType);

    public abstract void i(eyee eyeeVar);

    public final crbv j() {
        b().ifPresent(new Consumer() { // from class: crbt
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                Duration duration = (Duration) obj;
                if (duration.toMillis() <= 0) {
                    crbu crbuVar = crbu.this;
                    ensz enszVar = (ensz) crbv.h.j();
                    enszVar.Y(csux.A, duration);
                    ((ensz) enszVar.h("com/google/android/apps/messaging/shared/transfer/uploads/FileUploadInfo$Builder", "build", 75, "FileUploadInfo.java")).q("Ignoring invalid duration for audio file");
                    crbuVar.c(null);
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return a();
    }
}
