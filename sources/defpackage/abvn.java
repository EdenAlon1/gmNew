package defpackage;

import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abvn implements abvb {
    private static final entd a = entd.c("LoggingReporter");

    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, java.util.Collection] */
    @Override // defpackage.abuy
    public final void b(abux abuxVar) {
        ensz enszVar = (ensz) ((ensz) a.j()).h("com/google/android/apps/messaging/custodian/reporter/sinks/logger/LoggingReporter", "reportError", 17, "LoggingReporter.java");
        abuu abuuVar = (abuu) abuxVar;
        switch (abuuVar.a.ordinal()) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                StringBuilder sb = new StringBuilder();
                sb.append(abuuVar.a.name());
                sb.append(": occurred in conversation with id=");
                sb.append(abuuVar.b);
                if (abuuVar.d.isPresent()) {
                    sb.append(" in message id=");
                    sb.append((String) abuuVar.d.get());
                }
                if (abuuVar.e.isPresent()) {
                    sb.append(" with forked conversation join states(");
                    sb.append((String) Collection.EL.stream(abuuVar.e.get()).map(new Function() { // from class: abuv
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return byyq.a(((Integer) obj).intValue());
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).collect(Collectors.joining(", ")));
                    sb.append(")");
                }
                if (abuuVar.f.isPresent()) {
                    sb.append(" with forked conversation different names local count= ");
                    sb.append(abuuVar.f.get());
                }
                enszVar.t("%s", sb.toString());
                return;
            default:
                throw new IllegalStateException("No error message implemented for error: ".concat(String.valueOf(abuuVar.a.name())));
        }
    }
}
