package defpackage;

import com.google.android.rcs.client.messaging.data.ContentType;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.AbstractMap;
import java.util.Map;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eilz extends eila {
    @Override // defpackage.eila
    public final void c(ContentType contentType, clnl clnlVar) {
        clnlVar.a((Iterable) Collection.EL.stream(contentType.a().entrySet()).map(new Function() { // from class: eilx
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Map.Entry entry = (Map.Entry) obj;
                clnn clnnVar = (clnn) clno.a.createBuilder();
                String str = (String) entry.getKey();
                clnnVar.copyOnWrite();
                clno clnoVar = (clno) clnnVar.instance;
                str.getClass();
                clnoVar.b |= 1;
                clnoVar.c = str;
                String str2 = (String) entry.getValue();
                clnnVar.copyOnWrite();
                clno clnoVar2 = (clno) clnnVar.instance;
                str2.getClass();
                clnoVar2.b |= 2;
                clnoVar2.d = str2;
                return (clno) clnnVar.build();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.toList()));
    }

    @Override // defpackage.eila
    public final void d(clnm clnmVar, eifc eifcVar) {
        eifcVar.h(enhk.i((Iterable) Collection.EL.stream(clnmVar.e).map(new Function() { // from class: eily
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                clno clnoVar = (clno) obj;
                String str = clnoVar.c;
                String str2 = clnoVar.d;
                str.getClass();
                str2.getClass();
                return new AbstractMap.SimpleImmutableEntry(str, str2);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.toList())));
    }
}
