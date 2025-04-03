package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejzf implements ejze {
    @Override // defpackage.ejze
    public final void a(List list, List list2, emwj emwjVar, vk vkVar) {
        int size = list.size();
        int size2 = list2.size();
        int min = Math.min(size, size2);
        int i = 0;
        while (i < min) {
            if (!emwjVar.d(list.get(i), list2.get(i))) {
                int i2 = i + 1;
                while (i2 < min && !emwjVar.d(list.get(i2), list2.get(i2))) {
                    i2++;
                }
                int i3 = i2 - i;
                vkVar.x(i, i3);
                vkVar.w(i, i3);
                i = i2;
            }
            i++;
        }
        if (size > min) {
            vkVar.x(min, size - min);
        }
        if (size2 > min) {
            vkVar.w(min, size2 - min);
        }
    }
}
