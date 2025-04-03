package defpackage;

import android.content.Context;
import com.google.android.rcs.client.messaging.data.ContentType;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csug {
    private final Context a;
    private final csuk b;
    private final Optional c;
    private final ffbr d;
    private final ffbr e;

    public csug(Context context, csuk csukVar, Optional optional, ffbr ffbrVar, ffbr ffbrVar2) {
        this.a = context;
        this.b = csukVar;
        this.c = optional;
        this.d = ffbrVar;
        this.e = ffbrVar2;
    }

    private final long c() {
        return this.b.d(this.a);
    }

    public final csuf a(long j) {
        int b = ((ctwb) this.e.b()).b();
        ffbr ffbrVar = this.e;
        long c = c();
        return (dksg.b(this.a) || !((ctwb) ffbrVar.b()).h(b).C() || ((ckby) this.d.b()).c()) ? c == -1 ? new csub(-1L, Optional.of("File auto download is disabled by RCS config")) : j > c ? new csub(c, Optional.of("File is bigger than max auto download file size")) : new csub(c, Optional.empty()) : new csub(c, Optional.of("File auto download is disabled while roaming"));
    }

    public final csuf b(ContentType contentType, long j) {
        return ((Boolean) this.c.map(new Function() { // from class: csue
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Boolean.valueOf(((csul) obj).a());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(true)).booleanValue() ? a(j) : new csub(c(), Optional.of("File auto download is disabled for the content type: ".concat(contentType.toString())));
    }
}
