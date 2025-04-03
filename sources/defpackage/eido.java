package defpackage;

import com.android.vcard.VCardBuilder;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class eido implements edzh {
    public static eidn f() {
        eide eideVar = new eide();
        eideVar.g("", "urn:ietf:params:cpim-headers:");
        return eideVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final String i() {
        StringBuilder sb = new StringBuilder();
        enqu listIterator = b().entrySet().listIterator();
        while (listIterator.hasNext()) {
            Map.Entry entry = (Map.Entry) listIterator.next();
            if (!emxe.c((String) entry.getKey())) {
                sb.append("NS: ");
                sb.append((String) entry.getKey());
                sb.append(" <");
                sb.append((String) entry.getValue());
                sb.append(">\r\n");
            }
        }
        enot enotVar = ((enot) b()).d;
        engw e = e();
        int i = ((enou) e).c;
        for (int i2 = 0; i2 < i; i2++) {
            eidt eidtVar = (eidt) e.get(i2);
            String str = (String) enotVar.get(eidtVar.b());
            if (!emxe.c(str)) {
                sb.append(str);
                sb.append('.');
            }
            sb.append(eidtVar.a());
            sb.append(": ");
            sb.append(eidtVar.c());
            sb.append(VCardBuilder.VCARD_END_OF_LINE);
        }
        sb.append(VCardBuilder.VCARD_END_OF_LINE);
        return sb.toString();
    }

    public abstract eidr a();

    public abstract engf b();

    /* JADX WARN: Type inference failed for: r2v5, types: [edzh, java.lang.Object] */
    @Override // defpackage.edzh
    public final InputStream d() {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(i().getBytes(StandardCharsets.UTF_8));
        eidr a = a();
        InputStream byteArrayInputStream2 = new ByteArrayInputStream(a.e().getBytes(StandardCharsets.UTF_8));
        eidh eidhVar = (eidh) a;
        if (eidhVar.b.isPresent()) {
            byteArrayInputStream2 = new SequenceInputStream(byteArrayInputStream2, eidhVar.b.get().d());
        } else {
            dkty.h(eidr.c, "MessageContent is null, returning only headers stream", new Object[0]);
        }
        return new SequenceInputStream(byteArrayInputStream, byteArrayInputStream2);
    }

    public abstract engw e();

    /* JADX WARN: Multi-variable type inference failed */
    public final Optional g(String str) {
        engw e = e();
        int i = ((enou) e).c;
        int i2 = 0;
        while (i2 < i) {
            eidt eidtVar = (eidt) e.get(i2);
            i2++;
            if (eidtVar.a().equals(str)) {
                return Optional.of(eidtVar);
            }
        }
        return Optional.empty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Optional h(String str) {
        engw e = e();
        int i = ((enou) e).c;
        for (int i2 = 0; i2 < i; i2++) {
            eidt eidtVar = (eidt) e.get(i2);
            if (eidtVar.a().equals(str) && "urn:ietf:params:imdn".equals(eidtVar.b())) {
                return Optional.of(eidtVar);
            }
        }
        return Optional.empty();
    }

    @Override // defpackage.edzh
    public final long j() {
        int length = i().length();
        eidr a = a();
        return length + a.e().length() + ((Long) ((eidh) a).b.map(new Function() { // from class: eidp
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Long.valueOf(((edzh) obj).j());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(0L)).longValue();
    }
}
