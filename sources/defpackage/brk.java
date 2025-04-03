package defpackage;

import android.util.Size;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class brk {
    private static final Set a;
    public static final brk b;
    public static final brk c;
    public static final brk d;
    public static final brk e;
    public static final brk f;
    public static final brk g;
    static final brk h;
    public static final List i;

    static {
        List unmodifiableList = DesugarCollections.unmodifiableList(Arrays.asList(new Size(720, 480), new Size(640, 480)));
        int i2 = brj.a;
        bqq bqqVar = new bqq(4, "SD", unmodifiableList);
        b = bqqVar;
        bqq bqqVar2 = new bqq(5, "HD", Collections.singletonList(new Size(1280, 720)));
        c = bqqVar2;
        bqq bqqVar3 = new bqq(6, "FHD", Collections.singletonList(new Size(1920, 1080)));
        d = bqqVar3;
        bqq bqqVar4 = new bqq(8, "UHD", Collections.singletonList(new Size(3840, 2160)));
        e = bqqVar4;
        bqq bqqVar5 = new bqq(0, "LOWEST", Collections.EMPTY_LIST);
        f = bqqVar5;
        bqq bqqVar6 = new bqq(1, "HIGHEST", Collections.EMPTY_LIST);
        g = bqqVar6;
        h = new bqq(-1, "NONE", Collections.EMPTY_LIST);
        a = new HashSet(Arrays.asList(bqqVar5, bqqVar6, bqqVar, bqqVar2, bqqVar3, bqqVar4));
        i = Arrays.asList(bqqVar4, bqqVar3, bqqVar2, bqqVar);
    }

    public static boolean d(brk brkVar) {
        return a.contains(brkVar);
    }
}
