def solution(participant, completion):
    answer = ''
    dic = {}
    for part in participant:
        dic[part] = dic.setdefault(part,0) + 1
    for comp in completion:
        dic[comp] = dic[comp] - 1
    for key in dic.keys():
        if dic[key] != 0:
            return key
