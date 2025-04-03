package defpackage;

import java.text.BreakIterator;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jwx implements jmi {
    public final jpo a;
    public final jse b;
    public final jxa c;
    public final CharSequence d;
    public final jqb e;
    public jxm f;
    public final int g;
    private final String h;
    private final List i;
    private final List j;
    private final jzn k;
    private final boolean l;

    /* JADX WARN: Code restructure failed: missing block: B:424:0x0093, code lost:
    
        if (r5 == 1) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x061f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x074d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x07c4  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x07f2  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0810  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0583  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0107 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:396:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x019d A[LOOP:1: B:42:0x0197->B:44:0x019d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02a7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00a3  */
    /* JADX WARN: Type inference failed for: r24v1 */
    /* JADX WARN: Type inference failed for: r24v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r24v3 */
    /* JADX WARN: Type inference failed for: r25v1 */
    /* JADX WARN: Type inference failed for: r25v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r25v3 */
    /* JADX WARN: Type inference failed for: r31v0 */
    /* JADX WARN: Type inference failed for: r31v1, types: [jxv] */
    /* JADX WARN: Type inference failed for: r31v2 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15, types: [jou] */
    /* JADX WARN: Type inference failed for: r3v41 */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17, types: [android.text.Spannable, java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r7v19, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public jwx(java.lang.String r46, defpackage.jpo r47, java.util.List r48, java.util.List r49, defpackage.jse r50, defpackage.jzn r51) {
        /*
            Method dump skipped, instructions count: 2258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jwx.<init>(java.lang.String, jpo, java.util.List, java.util.List, jse, jzn):void");
    }

    @Override // defpackage.jmi
    public final float a() {
        return this.e.b();
    }

    @Override // defpackage.jmi
    public final float b() {
        float f;
        jqb jqbVar = this.e;
        if (!Float.isNaN(jqbVar.c)) {
            return jqbVar.c;
        }
        BreakIterator lineInstance = BreakIterator.getLineInstance(jqbVar.b.getTextLocale());
        CharSequence charSequence = jqbVar.a;
        lineInstance.setText(new jpu(charSequence, charSequence.length()));
        PriorityQueue priorityQueue = new PriorityQueue(10, new Comparator() { // from class: jqa
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                ffcf ffcfVar = (ffcf) obj;
                ffcf ffcfVar2 = (ffcf) obj2;
                return (((Number) ffcfVar.b).intValue() - ((Number) ffcfVar.a).intValue()) - (((Number) ffcfVar2.b).intValue() - ((Number) ffcfVar2.a).intValue());
            }
        });
        int i = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new ffcf(Integer.valueOf(i), Integer.valueOf(next)));
            } else {
                ffcf ffcfVar = (ffcf) priorityQueue.peek();
                if (ffcfVar != null && ((Number) ffcfVar.b).intValue() - ((Number) ffcfVar.a).intValue() < next - i) {
                    priorityQueue.poll();
                    priorityQueue.add(new ffcf(Integer.valueOf(i), Integer.valueOf(next)));
                }
            }
            i = next;
        }
        if (priorityQueue.isEmpty()) {
            f = 0.0f;
        } else {
            Iterator it = priorityQueue.iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            ffcf ffcfVar2 = (ffcf) it.next();
            float a = jqbVar.a(((Number) ffcfVar2.a).intValue(), ((Number) ffcfVar2.b).intValue());
            while (it.hasNext()) {
                ffcf ffcfVar3 = (ffcf) it.next();
                a = Math.max(a, jqbVar.a(((Number) ffcfVar3.a).intValue(), ((Number) ffcfVar3.b).intValue()));
            }
            f = a;
        }
        jqbVar.c = f;
        return f;
    }

    @Override // defpackage.jmi
    public final boolean c() {
        jxm jxmVar = this.f;
        if (jxmVar != null && jxmVar.a()) {
            return true;
        }
        if (!this.l && jwy.a(this.a)) {
            int i = jxh.a;
            if (((Boolean) jxh.a().a()).booleanValue()) {
                return true;
            }
        }
        return false;
    }
}
