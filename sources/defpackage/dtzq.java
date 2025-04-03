package defpackage;

import android.database.DatabaseUtils;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtzq implements dtzj {
    private final String a;
    private final Object[] b;

    public dtzq(String str, Object[] objArr) {
        this.a = str;
        this.b = objArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final String c(List list, dtzu dtzuVar) {
        char c;
        int i;
        int i2;
        String obj;
        String str;
        char c2;
        dtyo dtyoVar;
        final String str2;
        String str3;
        StringBuilder sb = new StringBuilder(this.a);
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int indexOf = sb.indexOf("$", i3);
            if (indexOf == -1) {
                if (i4 >= this.b.length - 1) {
                    return sb.toString();
                }
                throw new IllegalArgumentException("too many args for format: ".concat(this.a));
            }
            if (indexOf == sb.length() - 1) {
                throw new IllegalArgumentException("bad format specifier in format: ".concat(this.a));
            }
            int i5 = indexOf + 1;
            char charAt = sb.charAt(i5);
            if (charAt == '$') {
                sb.replace(indexOf, indexOf + 2, "$");
                i3 = i5;
            } else {
                Object[] objArr = this.b;
                if (i4 >= objArr.length) {
                    throw new IllegalArgumentException("too few args for format: ".concat(this.a));
                }
                final Object obj2 = objArr[i4];
                if (obj2 == null) {
                    StringBuilder sb2 = new StringBuilder("found null arg at position: ");
                    sb2.append(i4 - 1);
                    throw new IllegalArgumentException(sb2.toString());
                }
                if (charAt == 'R') {
                    c = 0;
                    if (obj2 instanceof dtry) {
                        throw new IllegalArgumentException(a.h(indexOf, "did not expect ColumnReference (use $V rather than $R): at position "));
                    }
                    if (obj2 instanceof dtzj) {
                        throw new IllegalArgumentException(a.h(indexOf, "did not expect SqlExpression (use $V rather than $R): at position "));
                    }
                    if (obj2 instanceof Number) {
                        throw new IllegalArgumentException(a.h(indexOf, "did not expect Number (use $V rather than $R): at position "));
                    }
                } else if (charAt != 'V') {
                    c = 0;
                } else {
                    c = 0;
                    if (Collection.EL.stream(engw.v(Number.class, String.class, dtry.class, dtzj.class, List.class)).noneMatch(new Predicate() { // from class: dtzo
                        public final /* synthetic */ Predicate and(Predicate predicate) {
                            return Predicate$CC.$default$and(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        /* renamed from: negate */
                        public final /* synthetic */ Predicate mo439negate() {
                            return Predicate$CC.$default$negate(this);
                        }

                        public final /* synthetic */ Predicate or(Predicate predicate) {
                            return Predicate$CC.$default$or(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj3) {
                            return ((Class) obj3).isAssignableFrom(obj2.getClass());
                        }
                    })) {
                        throw new IllegalStateException("$V args must be an acceptable class instance -- found ".concat(String.valueOf(obj2.getClass().getSimpleName())));
                    }
                    if ((obj2 instanceof List) && !Collection.EL.stream((List) obj2).allMatch(new Predicate() { // from class: dtzp
                        public final /* synthetic */ Predicate and(Predicate predicate) {
                            return Predicate$CC.$default$and(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        /* renamed from: negate */
                        public final /* synthetic */ Predicate mo439negate() {
                            return Predicate$CC.$default$negate(this);
                        }

                        public final /* synthetic */ Predicate or(Predicate predicate) {
                            return Predicate$CC.$default$or(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj3) {
                            return obj3 == null || (obj3 instanceof String);
                        }
                    })) {
                        throw new IllegalStateException("List args must be a list of String");
                    }
                }
                int i6 = i4 + 1;
                AtomicInteger atomicInteger = new AtomicInteger(2);
                char c3 = 1;
                if (charAt == 'R') {
                    i = i6;
                    i2 = i5;
                    obj = obj2.toString();
                } else {
                    if (charAt != 'V') {
                        throw new IllegalArgumentException("unknown format specifier: " + charAt + " at position " + indexOf);
                    }
                    if (obj2 instanceof Number) {
                        obj = obj2.toString();
                        i = i6;
                        i2 = i5;
                    } else if (obj2 instanceof String) {
                        str = obj2.toString();
                        obj = DatabaseUtils.sqlEscapeString(str);
                        i = i6;
                        i2 = i5;
                        c3 = c;
                        if (c3 == 0 || list == null) {
                            String str4 = obj;
                            sb.replace(indexOf, atomicInteger.get() + indexOf, str4);
                            i3 = indexOf + str4.length();
                        } else {
                            sb.replace(indexOf, atomicInteger.get() + indexOf, "?");
                            if (str != null) {
                                obj = str;
                            }
                            list.add(obj);
                            i3 = i2;
                        }
                        i4 = i;
                    } else {
                        boolean z = obj2 instanceof dtry;
                        if (z) {
                            int i7 = indexOf + 2;
                            if (i7 >= sb.length() || sb.charAt(i7) != '{') {
                                i = i6;
                                i2 = i5;
                                c2 = 1;
                                dtyoVar = null;
                            } else {
                                StringBuilder sb3 = new StringBuilder();
                                while (true) {
                                    char charAt2 = sb.charAt(sb3.length() + indexOf + 3);
                                    if (charAt2 == '}') {
                                        break;
                                    }
                                    sb3.append(charAt2);
                                }
                                String[] split = sb3.toString().split(":", -1);
                                dtvs dtvsVar = dtzuVar != null ? dtzuVar.a : null;
                                int length = split.length;
                                i = i6;
                                if (length != 1) {
                                    c2 = 1;
                                    if (length != 2) {
                                        throw new IllegalArgumentException("split expected to return 1 or 2 elements ".concat(sb3.toString()));
                                    }
                                    str2 = split[1];
                                    str3 = split[c];
                                } else {
                                    c2 = 1;
                                    str2 = split[c];
                                    str3 = "J";
                                }
                                if (str2.isEmpty()) {
                                    throw new IllegalArgumentException("empty tag: ".concat(sb3.toString()));
                                }
                                i2 = i5;
                                if (!str3.equals("J") && !str3.equals("X")) {
                                    throw new IllegalArgumentException("invalid tag type: ".concat(String.valueOf(str3)));
                                }
                                if (dtvsVar == null && str3.equals("J")) {
                                    throw new IllegalArgumentException("cannot combine non dynamic join query with J");
                                }
                                dtyoVar = str3.equals("X") ? new dtyo() { // from class: dtzl
                                    @Override // defpackage.emwl
                                    public final Object apply(Object obj3) {
                                        String str5 = (String) obj3;
                                        int indexOf2 = str5.indexOf(".");
                                        String str6 = str2;
                                        if (indexOf2 == -1) {
                                            return str6;
                                        }
                                        return String.valueOf(str6).concat(String.valueOf(str5.substring(indexOf2)));
                                    }
                                } : dtvsVar != null ? dtvsVar.b(str2) : new dtyo() { // from class: dtzm
                                    @Override // defpackage.emwl
                                    public final Object apply(Object obj3) {
                                        return (String) obj3;
                                    }
                                };
                                atomicInteger.addAndGet(sb3.length() + 2);
                            }
                            if (z) {
                                dtry dtryVar = (dtry) obj2;
                                obj = dtyoVar != null ? dtyoVar.apply(((dtqt) dtryVar.a).a) : ((dtqt) dtryVar.a).a;
                                c3 = c2;
                            } else {
                                obj = "";
                            }
                        } else {
                            i = i6;
                            i2 = i5;
                            c2 = 1;
                            if (obj2 instanceof dtzj) {
                                obj = ((dtzj) obj2).ag(dtzuVar);
                            } else if (obj2 instanceof List) {
                                obj = (String) Collection.EL.stream((List) obj2).map(new Function() { // from class: dtzn
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo448andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj3) {
                                        return obj3 == null ? "NULL" : DatabaseUtils.sqlEscapeString((String) obj3);
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                }).collect(Collectors.joining(","));
                            } else {
                                obj = "";
                            }
                            c3 = c2;
                        }
                    }
                    c3 = c;
                }
                str = null;
                if (c3 == 0) {
                }
                String str42 = obj;
                sb.replace(indexOf, atomicInteger.get() + indexOf, str42);
                i3 = indexOf + str42.length();
                i4 = i;
            }
        }
    }

    @Override // defpackage.dtzj
    public final String ag(dtzu dtzuVar) {
        return c(null, dtzuVar);
    }

    @Override // defpackage.dtzj
    public final String ah(dtzu dtzuVar, List list) {
        return c(list, dtzuVar);
    }

    @Override // defpackage.dtzj
    public final void ai(dtse dtseVar) {
        int i = 0;
        int i2 = 0;
        while (true) {
            int indexOf = this.a.indexOf("$", i);
            if (indexOf == -1) {
                return;
            }
            String str = this.a;
            if (indexOf == str.length() - 1) {
                throw new IllegalArgumentException("bad format specifier in format: ".concat(str));
            }
            i = indexOf + 1;
            Object[] objArr = this.b;
            char charAt = str.charAt(i);
            if (i2 >= objArr.length) {
                throw new IllegalArgumentException("too few args for format: ".concat(this.a));
            }
            int i3 = i2 + 1;
            Object obj = this.b[i2];
            if (charAt == 'V' && (obj instanceof dtry)) {
                dtseVar.b(obj.toString(), null);
            }
            i2 = i3;
        }
    }
}
